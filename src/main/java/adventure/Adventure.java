package adventure;

import hero.Hero;
import utils.Time;

import java.io.IOException;

public class Adventure {
    private Time time = new Time();
    public void start() throws IOException {
        System.out.print("Hi, " + new Hero().getName() + "!\nYou can read, sleep, eat, work, study, enjoy, wash, train yourself and go date a girl.\n");
        welcome();
    }
    //    while (true)
    public void welcome(){
        System.out.print("What you are going to do next? (just type a word! Type \"help\" for help.)\n");
    }

/*
            //if hero is asked to read
            if ("read".equals(str.toLowerCase())) {
                BookList bookList = new BookList();
                System.out.print("\n");
                bookList.showBookList();
                BookSwitcher.switcher(br.readLine());
                System.out.print("\n");
                String s = "Reading a books...";
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
                System.out.print("Type: read - to read a books\n      sleep - to sleep\n      eat - to eat food\n      " +
                        "work - to do some job and earn money\n      enjoy - to spend some time with relax\n      " +
                        "train - to go to gym\n      study - to gain some knowledge\n      wash - to clean the hero\n      " +
                        "date - to go to date\n      show time - to show the game time\n      end - to exit");
            }

            if ("end".equals(str.toLowerCase()))
                break;


      }
    }*/
}
