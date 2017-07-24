package hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 21.02.2017.
 */
class Enjoyment {
    public static void go(int m, int x, int h, int r, int ex, String info){
        if(Hero.money + m < 0) {
            System.out.print("Sorry, not enough money. Work to earn more.\n");
            Delta.money = null;
            Delta.hunger = null;
            Delta.excitement = null;
            Delta.rest = null;
        } else {
            Hero.money += m;
            Delta.money = (m == 0 ? "" : "(" + m + ")");
            Hero.time.addTime(30 * x);

            Hero.hunger += h;
            Delta.hunger = "(" + h + ")";

            Hero.rest += r;
            Delta.rest = "(" + (r > 0 ? "+" : "") + r + ")";

            Hero.excitement += ex;
            Delta.excitement = "(" + (ex > 0 ? "+" : "") + ex + ")";

            System.out.print("\n" + info + "\n");
            Printer.printStats();
            System.out.print("Now you are more restored!\n\n");
        }
    }
}
class TV extends Enjoyment{
    static String id = "Watch TV";
    static String info = "Watch TV to get stupid.";
    static int m = 0;
    static int x = 2;
    static int h = -2;
    static int r = 10;
    static int ex = 20;
}

class Theater extends Enjoyment{
    static String info = "Go and develop yourself culturally!";
    static int m = -3;
    static int x = 4;
    static int h = -5;
    static int r = 25;
    static int ex = 40;
}

class Cinema extends Enjoyment{
    static String info = "What movie is on screen now?";
    static int m = -2;
    static int x = 6;
    static int h = -8;
    static int r = 5;
    static int ex = 30;
}

class Dance extends Enjoyment{
    static String info = "I'd like to move it, move it...";
    static int m = 0;
    static int x = 1;
    static int h = -10;
    static int r = 5;
    static int ex = 30;
}

class Skate extends Enjoyment{
    static String info = "Off the wall!";
    static int m = 0;
    static int x = 2;
    static int h = -15;
    static int r = 10;
    static int ex = 25;
}

class EnjoymentSwitcher {

    public static void switcher(String chosen){
        switch (chosen.toLowerCase()) {
            case "tv": TV.go(TV.m, TV.x, TV.h, TV.r, TV.ex, TV.info);
                break;
            case "theater": Theater.go(Theater.m, Theater.x, Theater.h, Theater.r, Theater.ex, Theater.info);
                break;
            case "cinema": Cinema.go(Cinema.m, Cinema.x, Cinema.h, Cinema.r, Cinema.ex, Cinema.info);
                break;
            case "dance": Dance.go(Dance.m, Dance.x, Dance.h, Dance.r, Dance.ex, Dance.info);
                break;
            case "skate": Skate.go(Skate.m, Skate.x, Skate.h, Skate.r, Skate.ex, Skate.info);
                break;
            default:
                Printer.p("Sorry, but you have no thoughts, how to do this. Try again.");
        }
    }
}

class EnjoymentList {
    ArrayList<String> enjoyList = new ArrayList<>();

    public ArrayList<String> getEnjoymentList() {
        enjoyList.add(TV.id);
        enjoyList.add(Theater.class.getSimpleName());
        enjoyList.add(Cinema.class.getSimpleName());
        enjoyList.add(Dance.class.getSimpleName());
        enjoyList.add(Skate.class.getSimpleName());
        return enjoyList;
    }

    public void showEnjoymentList() {
        getEnjoymentList();
        for (String x : enjoyList)
            System.out.print(x + ", ");
        Printer.p();
    }
}
