package hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Maksym on 14.02.2017.
 */
public class Hero {
    String name;
    static int xp = 0;
    static int hunger = 100;
    static int rest = 100;
    static int excitement = 100;
    static int appeal = 0;
    static int money = 10;
    static float studyingProcess = 0.0f;
    static float fitness = 0.0f;
    static Level level = new Level();
    static Time time = new Time();
    public Hero () {}
    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void start() throws IOException {
        System.out.print("Hi, my hero!\nYou can read, sleep, eat, work, study, enjoy, wash, train yourself and go date a girl.\n");

        while (true)
        {
            System.out.print("What you are going to do next? (just type a word! Type \"help\" for help.)\n");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            //if hero is asked to read
            if ("read".equals(str.toLowerCase())) {
                BookList bookList = new BookList();
                System.out.print("\n");
                bookList.showBookList();
                BookSwitcher.switcher(br.readLine());
                System.out.print("\n");
                String s = "Reading a book...";
                String f = "You are now smarter!";
                Printer.p(s, f);
            }

            if ("sleep".equals(str.toLowerCase())) {
                String s = "Sleeping...";
                String f = "Renovated!";
                sleep();
                Printer.p(s, f);
            }

            if ("eat".equals(str.toLowerCase())) {
                FoodList foodList = new FoodList();
                System.out.print("\n");
                foodList.showFoodList();
                FoodSwitcher.switcher(br.readLine());
            }

            if ("work".equals(str.toLowerCase())) {
                String s = "Working...";
                String f = "Work done!";
                work();
                Printer.p(s, f);
            }

            if ("enjoy".equals(str.toLowerCase())) {
                EnjoymentList enjoymentList = new EnjoymentList();
                System.out.print("\n");
                enjoymentList.showEnjoymentList();
                EnjoymentSwitcher.switcher(br.readLine());
            }

            if ("study".equals(str.toLowerCase())) {
                String s = "Diving into the pile of books...";
                String f = "Progress!";
                study();
                Printer.p(s, f);
                System.out.println("Study Process: " + studyingProcess * 100 + "%\n");
            }

            if ("wash".equals(str.toLowerCase())) {
                WashList washList = new WashList();
                washList.showWashList();
                WashSwitcher.switcher(br.readLine());

                System.out.print("Cleaning yourself...\n");
                System.out.println("Appeal: " + appeal + "   | " + Delta.appeal);
                System.out.print("\nCleaner a bit!");
            }

            if ("train".equals(str.toLowerCase())) {
                TrainList trainList = new TrainList();
                System.out.print("\n");
                trainList.showTrainList();
                TrainSwitcher.switcher(br.readLine());

                String s = "Longer, better, faster, stronger...";
                String f = "Uchh, nice training.";
                Printer.p(s, f);
                System.out.println("Fitness level: " + fitness * 100 + "%\n");
            }

            if ("date".equals(str.toLowerCase())) {
                date();
            }

            if ("show time".equals(str.toLowerCase())){
                time.showTime();
            }

            if ("help".equals(str.toLowerCase())) {
                System.out.print("Type: read - to read a book\n      sleep - to sleep\n      eat - to eat food\n      " +
                        "work - to do some job and earn money\n      enjoy - to spend some time with relax\n      " +
                        "train - to go to gym\n      study - to gain some knowledge\n      wash - to clean the hero\n      " +
                        "date - to go to date\n      show time - to show the game time\n      end - to exit");
            }

            if ("end".equals(str.toLowerCase()))
                break;
        }
    }

    public static void sleep (){
        time.addTime(360);
        hunger -= 3;
        Delta.hunger = "(-3)";
        rest += 20;
        Delta.rest = "(+20)";
    }

    public static void work(){
        time.addTime(480);
        level.xpEarn(5);
        hunger -= 20;
        Delta.hunger = "(-20)";
        rest -= 20;
        Delta.rest = "(-20)";
        excitement -= 20;
        Delta.excitement = "(-20)";
        money += 10;
        Delta.money = "(+10)";
    }

    public static void study(){
        time.addTime(360);
        level.xpEarn(5);
        hunger -= 20;
        Delta.hunger = "(-20)";
        rest -= 15;
        Delta.rest = "(-15)";
        excitement -= 20;
        Delta.excitement = "(-20)";

        if (studyingProcess < 1.0f)
            studyingProcess += 0.05f;
        else
            System.out.println("You have already finished the University!");
    }

    public static void date() throws IOException {
        time.addTime(120);

        System.out.println("You are going to hunt a new chick. Who'd be next?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Girl girl = new Girl(br.readLine());
        if (girl.lucky.nextInt(2) == 1)
            System.out.println("You've found a couple! Her name is "+ girl.name);
        else
            System.out.println("Not your time, bro.");
    }
}
