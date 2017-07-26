package spring;

import adventure.Adventure;
import hero.Action;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Created by Maksym on 25.07.2017.
 */
public class Boot {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Adventure adventure = (Adventure) context.getBean("adventure");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Action bean = (Action)context.getBean(str.toLowerCase());
        /*if (bean instanceof body.Body) {
            Body body = (Body) bean;
        } else if (bean instanceof books.Book) {
            Book body = (Book) bean;
        } else if (bean instanceof enjoyment.Enjoyment) {
            Enjoyment body = (Enjoyment) bean;
        } else if (bean instanceof food.Food) {
            Food body = (Food) bean;
        } else if (bean instanceof washing.Washing) {
            Washing body = (Washing) bean;
        } */
        while(true) {
            adventure.welcome();
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            bean = (Action) context.getBean(str.toLowerCase());
        }
    }
}
