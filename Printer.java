package Hero;

/**
 * Created by Maksym on 23.02.2017.
 */
public class Printer {

    public static void p(){
        System.out.println();
    }

    public static void p(String str){
        System.out.println(str);
    }

    public static void p(String s, String f) {
        p(s);
        printStats();
        p(f);
        p();
    }

    public static void printStats(){
        p();
        System.out.println("XP: " + Hero.xp);
        System.out.println("Level: " + Hero.level.lvl);
        System.out.println("Hunger: " + Hero.hunger);
        System.out.println("Rest: " + Hero.rest);
        System.out.println("Excitement: " + Hero.excitement);
        System.out.println("Money: $" + Hero.money);
        p();
    }
}
