package com.mk.herorpg.logic;

import com.mk.herorpg.XmlBinding.JaxbParserImpl;
import com.mk.herorpg.config.AnnotationConfig;
import com.mk.herorpg.hero.Action;
import com.mk.herorpg.hero.Adventure;
import com.mk.herorpg.hero.Hero;
import com.mk.herorpg.utils.JsonConverter;
import com.mk.herorpg.utils.Printer;
import com.mk.herorpg.utils.Time;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;


/**
 * Created by Maksym on 25.07.2017.
 */
public class Start {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Adventure adventure = context.getBean(Adventure.class);
        Hero hero = context.getBean(Hero.class);
        ActionProcessor processor = context.getBean(ActionProcessor.class);
        Printer printer = context.getBean(Printer.class);
        Time time = context.getBean(Time.class);
        JaxbParserImpl parser = context.getBean(JaxbParserImpl.class);
        File file = new File("src\\main\\resources\\com\\mk\\herorpg\\XmlBinding\\hero.xml");
        /*DBInitializer dbInit = context.getBean(DBInitializer.class);
        HibernateConnector hibernateConnector = context.getBean(HibernateConnector.class);

        dbInit.init();*/
        hero = (Hero) parser.getObject(file, Hero.class);

        while(true) {
            adventure.welcome();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            Action action = (Action) context.getBean(str.toLowerCase());

            if (action instanceof com.mk.herorpg.actionImpl.books.Book || action instanceof com.mk.herorpg.actionImpl.enjoyment.Enjoyment || action instanceof com.mk.herorpg.actionImpl.activities.Dream
                    || action instanceof com.mk.herorpg.actionImpl.activities.Work) {
                processor.process(action, hero);
                printer.printStats(hero, action);
            } else if (action instanceof com.mk.herorpg.actionImpl.activities.Study) {
                processor.process(action, hero);
                printer.printStats(hero, action);
                printer.printStudyingProcess(hero, action);
            } else if (action instanceof com.mk.herorpg.actionImpl.body.Body || action instanceof com.mk.herorpg.actionImpl.food.Food ) {
                processor.process(action, hero);
                printer.printStats(hero, action);
                printer.printFitness(hero, action);
            } else if (action instanceof com.mk.herorpg.actionImpl.washing.Washing) {
                processor.process(action, hero);
                printer.printAppeal(hero, action);
            } else if(action instanceof com.mk.herorpg.utils.Time)
                time.showTime();
            else if (action instanceof com.mk.herorpg.utils.Exit) {
                br.close();
               //hibernateConnector.closeConnection();
                parser.saveObject(file, hero);
                JsonConverter.toJSON(hero);
                break;
            }
          //hibernateConnector.write(action);
        }
    }
}
