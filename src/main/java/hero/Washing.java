package hero;

import java.util.ArrayList;


/**
 * Created by Maksym on 23.02.2017.
 */
class Washing {
    public static void go(String info, int x) {
        Hero.time.addTime(10 * x);
        Hero.appeal += x;
        Delta.appeal = "(+" + x + ")";
        System.out.print("\n" + info + "\n");
    }
}
class Bath extends Washing {
    static String id = "Take a bath";
    static String info = "Better to use a salt bomb.";
    static int x = 3; //multiplier
}

class Shower extends Washing {
    static String id = "Take a shower";
    static String info = "Fast food in bathing.";
    static int x = 2;
}

class Teeth extends Washing {
    static String id = "Wash teeth";
    static String info = "Goal is to have a Hollywood smile.";
    static int x = 1;
}

class Nails extends Washing {
    static String id = "Cut nails";
    static String info = "Time to cut your cat nails!";
    static int x = 1;
}

class Hair extends Washing {
    static String id = "Grass hair";
    static String info = "Stylish look!";
    static int x = 1;
}

class WashSwitcher {

    public static void switcher(String chosen){
        switch (chosen.toLowerCase()) {
            case "bath": Bath.go(Bath.info, Bath.x);
                break;
            case "shower": Shower.go(Shower.info, Shower.x);
                break;
            case "teeth": Teeth.go(Teeth.info, Teeth.x);
                break;
            case "nails": Nails.go(Nails.info, Nails.x);
                break;
            case "hair": Hair.go(Hair.info, Hair.x);
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