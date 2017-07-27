package food;

import hero.Action;

/**
 * Created by Maksym on 21.02.2017.
 */
public class Food extends Action {
    public Food() {
    }

    /*public void eat(int m, int x, int h, int ex, float f, String info){
        if(Hero.money + m < 0) {
            System.out.print("Sorry, not enough money. Work to earn more.");
            Delta.money = null;
            Delta.hunger = null;
            Delta.excitement = null;
            Delta.fitness = null;
        } else if (Hero.fitness + f < -0.1f) {
            System.out.print("Wow, please abstain of it. Your health is to bad. Train yourself or eat some salad.\n");
            Printer.printFitness();

            Delta.money = null;
            Delta.hunger = null;
            Delta.excitement = null;
            Delta.fitness = null;
        } else {
            Hero.money += m;
            Delta.money = "(" + m + ")";
            Hero.time.addTime(15 * x);

            Hero.hunger += h;
            Delta.hunger = "(+" + h + ")";

            Hero.excitement += ex;
            Delta.excitement = "(+" + ex + ")";

            Hero.fitness += f;
            Delta.fitness = "(" + (f > 0 ? "+" : "") + f + ")";
            System.out.print("Eating...\n" + info + "\n");
            Printer.printStats();
            System.out.print("Eaten!" + f + "\n");
        }
    }*/
}
