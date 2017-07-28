package logic;

import adventure.Adventure;
import hero.Action;
import hero.Hero;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.Printer;

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

        while(true) {
            adventure.welcome();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            Action action = (Action) context.getBean(str.toLowerCase());

            if (action instanceof body.Body || action instanceof books.Book || action instanceof enjoyment.Enjoyment
                    || action instanceof food.Food || action instanceof activities.Dream || action instanceof activities.Work) {
                processor.process(action, hero);
                printer.printStats(hero, action);
            } else if (action instanceof activities.Study) {
                processor.process(action, hero);
                printer.printStats(hero, action);
                printer.printStudyingProcess(hero, action);
            } else if (action instanceof washing.Washing) {
                processor.process(action, hero);
                printer.printAppeal(hero, action);
            } else if (action instanceof utils.Exit)
                break;

        }
    }
}
