package utils;

/**
 * Created by Maksym on 23.02.2017.
 */
public class Printer {

    public void p(){
        System.out.println();
    }

    public void p(String str){
        System.out.println(str);
    }

    public void p(String s, String f) {
        p(s);
      //  printStats();
        p(f);
        p();
    }

  /*  public void printStats(){
        p();
        System.out.println("XP: " + Hero.xp + "          |  " + (Delta.xp != null ? Delta.xp : ""));
        System.out.println("Level: " + Hero.level.lvl);
        System.out.println("Hunger: " + Hero.hunger + "     |  " + (Delta.hunger != null ? Delta.hunger : ""));
        System.out.println("Rest: " + Hero.rest + "       |  " + (Delta.rest != null ? Delta.rest : ""));
        System.out.println("Excitement: " + Hero.excitement + " |  " + (Delta.excitement != null ? Delta.excitement : ""));
        System.out.println("Money: $" + Hero.money + "     |  " + (Delta.money != null ? Delta.money : ""));
        p();
    }

    public void printFitness() {
        System.out.println("Fitness: " + Hero.fitness + "   |  " + (Delta.fitness != null ? Delta.fitness : ""));
    }*/
}
