package hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 23.02.2017.
 */
class Body {
    protected static void go (String name){
        Hero.time.addTime(90);
        Hero.level.xpEarn(2);

        Hero.hunger -= 10;
        Delta.hunger = "(-10)";

        Hero.rest -= 15;
        Delta.rest = "(-15)";

        Hero.excitement -= 5;
        Delta.excitement = "(-5)";

        Hero.money -= 1;
        Delta.money = "(-1)";

        System.out.print("\n" + name + "\n");

        if (Hero.fitness < 1.0f)
            Hero.fitness += 0.05f;
        else
            Printer.p("You look enough like fit cutie! You've reached your best.");
    }
}

class Bicep extends Body{
    static String name = "Nice pillow for your head.";
}

class Neck extends Body{
    static String name = "Vital for keeping your head straight.";
}

class Legs extends Body{
    static String name = "Run, Forrest, run!.";
}

class Press extends Body{
    static String name = "Crush all received punches for ease.";
}

class Back extends Body{
    static String name = "Have a wall behind.";
}


class TrainSwitcher {
    protected static void switcher(String chosen){
        switch (chosen.toLowerCase()) {
            case "neck": Neck.go(Neck.name);
                break;
            case "bicep": Bicep.go(Bicep.name);
                break;
            case "legs": Legs.go(Legs.name);
                break;
            case "back": Back.go(Back.name);
                break;
            case "press": Press.go(Press.name);
                break;
            default:
                Printer.p("Sorry, but you cannot train such part of body. Try again.");
        }
    }
}

class TrainList {
    private ArrayList<String> trainList = new ArrayList<>();

    protected ArrayList<String> getTrainList (){
        trainList.add(Bicep.class.getSimpleName());
        trainList.add(Neck.class.getSimpleName());
        trainList.add(Legs.class.getSimpleName());
        trainList.add(Back.class.getSimpleName());
        trainList.add(Press.class.getSimpleName());
        return trainList;
    }

    protected void showTrainList(){
        getTrainList();
        for (String x : trainList)
            System.out.print(x + ", ");
        Printer.p();
    }
}
