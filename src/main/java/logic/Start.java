package logic;

import adventure.Adventure;
import hero.Action;
import hero.Hero;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.Printer;
import utils.Time;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Created by Maksym on 25.07.2017.
 */
public class Start {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Adventure adventure = (Adventure) context.getBean("adventure");
        Hero hero = (Hero)context.getBean("hero");
        ActionProcessor processor = (ActionProcessor)context.getBean("actionProcessor");
        Printer printer = (Printer) context.getBean("printer");
        Time time = (Time) context.getBean("time");

        while(true) {
            adventure.welcome();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            Action action = (Action) context.getBean(str.toLowerCase());

            if (action instanceof books.Book || action instanceof enjoyment.Enjoyment || action instanceof activities.Dream
                    || action instanceof activities.Work) {
                processor.process(action, hero);
                printer.printStats(hero, action);
            } else if (action instanceof activities.Study) {
                processor.process(action, hero);
                printer.printStats(hero, action);
                printer.printStudyingProcess(hero, action);
            } else if (action instanceof body.Body || action instanceof food.Food ) {
                processor.process(action, hero);
                printer.printStats(hero, action);
                printer.printFitness(hero, action);
            } else if (action instanceof washing.Washing) {
                processor.process(action, hero);
                printer.printAppeal(hero, action);
            } else if (action instanceof utils.Exit)
                break;
            else if(action instanceof utils.Time)
                time.showTime();
        }
    }
}
