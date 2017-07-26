package enjoyment;

import hero.Action;

/**
 * Created by Maksym on 21.02.2017.
 */
public class Enjoyment implements Action {
    public Enjoyment() {
    }

   /* public void go(int m, int x, int h, int r, int ex, String info){
        if(hero.Hero.money + m < 0) {
            System.out.print("Sorry, not enough money. Work to earn more.\n");
            Delta.money = null;
            Delta.hunger = null;
            Delta.excitement = null;
            Delta.rest = null;
        } else {
            hero.Hero.money += m;
            Delta.money = (m == 0 ? "" : "(" + m + ")");
            hero.Hero.time.addTime(30 * x);

            hero.Hero.hunger += h;
            Delta.hunger = "(" + h + ")";

            hero.Hero.rest += r;
            Delta.rest = "(" + (r > 0 ? "+" : "") + r + ")";

            hero.Hero.excitement += ex;
            Delta.excitement = "(" + (ex > 0 ? "+" : "") + ex + ")";

            System.out.print("\n" + info + "\n");
            Printer.printStats();
            System.out.print("Now you are more restored!\n\n");
        }
    }*/
}
