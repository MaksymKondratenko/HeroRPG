package Hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 23.02.2017.
 */
interface Body {
    static void go (){}
}

class Bicep implements Body{
    public static int power = 0;
    static String id = "Bicep";
    static String name = "Nice pillow for your head.";

    static public void go (){
        PowerUp.powerUp(power, name);
    }
}

class Neck implements Body{
    public static int power = 0;
    static String id = "Neck";
    static String name = "Vital for keeping your head straight.";

    public static void go(){
        PowerUp.powerUp(power, name);
    }
}

class Legs implements Body{
    public static int power = 0;
    static String id = "Legs";
    static String name = "Run, Forrest, run!.";

    static public void go (){
        PowerUp.powerUp(power, name);
    }
}

class Press implements Body{
    static public int power = 0;
    static String id = "Press";
    static String name = "Crush all met punches for ease.";

    static public void go (){
        PowerUp.powerUp(power, name);
    }
}

class Back implements Body{
    static public int power = 0;
    static String id = "Back";
    static String name = "Have a wall behind.";

    static public void go (){
        PowerUp.powerUp(power, name);
    }
}

class PowerUp{

    public static int powerUp(int power, String name){
        power += 1;
        Hero.time.addTime(90);
        Hero.level.xpEarn(2);
        Hero.hunger -= 10;
        Hero.rest -= 15;
        Hero.excitement -= 5;
        Hero.money -= 1;
        Printer.p();
        Printer.p(name);
        Printer.p();

        if (Hero.fitness < 1.0f)
            Hero.fitness += 0.05f;
        else
            Printer.p("You look enough like fit cutie! You've reached your best.");

        return power;
    }
}

class TrainSwitcher {

    public static void switcher(String chosen){
        switch (chosen) {
            case "neck": Neck.go();
                break;
            case "bicep": Bicep.go();
                break;
            case "legs": Legs.go();
                break;
            case "back": Back.go();
                break;
            case "press": Press.go();
                break;
            default:
                Printer.p("Sorry, but you cannot train such part of body. Try again.");
        }
    }
}

class TrainList {
    ArrayList<String> trainList = new ArrayList<>();

    public ArrayList<String> getTrainList (){
        trainList.add(Bicep.id);
        trainList.add(Neck.id);
        trainList.add(Legs.id);
        trainList.add(Back.id);
        trainList.add(Press.id);
        return trainList;
    }

    public void showTrainList(){
        getTrainList();
        for (String x : trainList)
            System.out.print(x + ", ");
        Printer.p();
    }
}
