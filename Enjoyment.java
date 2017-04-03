package Hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 21.02.2017.
 */
interface Enjoyment {
    String id = "Enjoyment";
    String name = "Uch... Finally!";
    static void go(){};
}
class TV implements Enjoyment{
    static String id = "Watch TV";
    static String name = "Watch TV to get stupid.";

    public static void go(){
        Hero.time.addTime(60);
        Hero.hunger -= 2;
        Hero.rest += 10;
        Hero.excitement +=20;
        Printer.p(name);
    }
}

class Theater implements Enjoyment{
    static String id = "Theater";
    static String name = "Go and develop yourself culturally!";

    public static void go(){
        Hero.money -= 3;
        Hero.time.addTime(120);
        Hero.hunger -= 5;
        Hero.rest += 25;
        Hero.excitement += 40;
        Printer.p(name);
    }
}

class Cinema implements Enjoyment{
    static String id = "Cinema";
    static String name = "What movie is on screen now?";

    public static void go(){
        Hero.money -= 2;
        Hero.time.addTime(180);
        Hero.hunger -= 8;
        Hero.rest += 5;
        Hero.excitement += 30;
        Printer.p(name);
    }
}

class Dance implements Enjoyment{
    static String id = "Dance";
    static String name = "I'd like to move it, move it...";

    public static void go(){
        Hero.time.addTime(15);
        Hero.hunger -= 10;
        Hero.rest += 5;
        Hero.excitement += 30;
        Printer.p(name);
    }
}

class Skate implements Enjoyment{
    static String id = "Skate";
    static String name = "Off the wall!";

    public static void go(){
        Hero.time.addTime(45);
        Hero.hunger -= 15;
        Hero.rest += 10;
        Hero.excitement += 25;
        Printer.p(name);
    }
}

class EnjoymentSwitcher {

    public static void switcher(String chosen){
        switch (chosen) {
            case "tv": TV.go();
                break;
            case "theater": Theater.go();
                break;
            case "cinema": Cinema.go();
                break;
            case "dance": Dance.go();
                break;
            case "skate": Skate.go();
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
        enjoyList.add(Theater.id);
        enjoyList.add(Cinema.id);
        enjoyList.add(Dance.id);
        enjoyList.add(Skate.id);
        return enjoyList;
    }

    public void showEnjoymentList() {
        getEnjoymentList();
        for (String x : enjoyList)
            System.out.print(x + ", ");
        Printer.p();
    }
}
