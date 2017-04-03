package Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

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

    public static void main (String[] args) throws IOException {

        while (true)
        {
            System.out.println("What's next?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            //if hero is asked to read
            if (str.equals("read")) {
                BookList bookList = new BookList();
                Printer.p();
                bookList.showBookList();
                BookSwitcher.switcher(br.readLine());
                Printer.p();
                String s = "Reading a book...";
                String f = "You are now smarter!";
                Printer.p(s, f);
            }

            if (str.equals("sleep")) {
                String s = "Sleeping...";
                String f = "Renovated!";
                sleep();
                Printer.p(s, f);
            }

            if (str.equals("eat")) {
                FoodList foodList = new FoodList();
                Printer.p();
                foodList.showFoodList();
                FoodSwitcher.switcher(br.readLine());
                Printer.p();
                String s = "Eating...";
                String f = "Eaten!";
                Printer.p(s, f);
            }

            if (str.equals("work")) {
                String s = "Working...";
                String f = "Work done!";
                work();
                Printer.p(s, f);
            }

            if (str.equals("enjoy")) {
                EnjoymentList enjoymentList = new EnjoymentList();
                Printer.p();
                enjoymentList.showEnjoymentList();
                EnjoymentSwitcher.switcher(br.readLine());
                Printer.p();
                String s = "Relaxing...";
                String f = "Now you are more restored!";
                Printer.p(s, f);
            }

            if (str.equals("study")) {
                String s = "Diving into the pile of books...";
                String f = "Progress!";
                study();
                Printer.p(s, f);
                System.out.println("Study Process: " + studyingProcess * 100 + "%");
                Printer.p();
            }

            if (str.equals("wash")) {
                WashList washList = new WashList();
                washList.showWashList();
                WashSwitcher.switcher(br.readLine());

                Printer.p("Cleaning yourself...");
                Printer.p();
                System.out.println("Appeal: " + appeal + " " + Delta.appeal);
                Printer.p();
                Printer.p("Cleaner a bit!");
            }

            if (str.equals("train")) {
                TrainList trainList = new TrainList();
                Printer.p();
                trainList.showTrainList();
                TrainSwitcher.switcher(br.readLine());

                String s = "Longer, better, faster, stronger...";
                String f = "Uchh, nice training.";
                Printer.p(s, f);
                System.out.println("Fitness level: " + fitness * 100 + "%");
                Printer.p();
            }

            if (str.equals("date")) {
                date();
            }

            if (str.equals("show time")){
                time.showTime();
            }

            if (str.equals("end"))
                break;
        }
    }

    public static void sleep (){
        time.addTime(360);
        hunger -= 3;
        rest += 20;
    }

    public static void work(){
        time.addTime(480);
        xp += 5;
        hunger -= 20;
        rest -= 20;
        excitement -= 20;
        money += 10;
    }

    public static void study(){
        time.addTime(360);
        level.xpEarn(5);
        hunger -= 20;
        rest -= 30;
        excitement -= 20;

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
