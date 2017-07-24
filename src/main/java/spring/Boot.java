package spring;

import hero.Hero;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Maksym on 25.07.2017.
 */
public class Boot {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Hero hero = (Hero)context.getBean("hero");
        hero.start();
    }
}
