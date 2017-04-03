package Hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 23.02.2017.
 */
class Bath {
    static String id = "Take a bath";
    static String name = "Better to use a salt bomb.";

    public static void go(){
        Hero.time.addTime(30);
        Hero.appeal += 3;
        Delta.appeal = "(+3)";
        Printer.p();
        Printer.p(name);
        Printer.p();
    }
}

class Shower {

    static String id = "Take a shower";
    static String name = "Fast food in bathing.";
    public static void go(){
        Hero.time.addTime(20);
        Hero.appeal += 2;
        Printer.p();
        Printer.p(name);
        Printer.p();
    }
}

class Teeth {

    static String id = "Wash teeth";
    static String name = "Goal is to have a Hollywood smile.";

    public static void wash(){
        Hero.time.addTime(5);
        Hero.appeal += 1;
        Printer.p();
        Printer.p(name);
        Printer.p();
    }
}

class Nails {

    static String id = "Cut nails";
    static String name = "Time to cut your cat nails!";

    public static void cut(){
        Hero.time.addTime(5);
        Hero.appeal += 1;
        Printer.p();
        Printer.p(name);
        Printer.p();
    }
}

class Hair {

    static String id = "Grass hair";
    static String name = "Stylish look!";

    public static void grass(){
        Hero.time.addTime(5);
        Hero.appeal += 1;
        Printer.p();
        Printer.p(name);
        Printer.p();
    }
}

class WashSwitcher {

    public static void switcher(String chosen){
        switch (chosen) {
            case "bath": Bath.go();
                break;
            case "shower": Shower.go();
                break;
            case "teeth": Teeth.wash();
                break;
            case "nails": Nails.cut();
                break;
            case "hair": Hair.grass();
                break;
            default:
                Printer.p("Sorry, but you cannot train such part of body. Try again.");
        }
    }
}

class WashList {
    ArrayList<String> washList = new ArrayList<>();

    public ArrayList<String> getWashList(){
        washList.add(Bath.id);
        washList.add(Shower.id);
        washList.add(Teeth.id);
        washList.add(Nails.id);
        washList.add(Hair.id);
        return washList;
    }

    public void showWashList(){
        getWashList();
        Printer.p();
        for (String x : washList)
            System.out.print(x + ", ");
        Printer.p();
    }
}