package hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 21.02.2017.
 */
class Book {
    public static void read(int xp, int h, int r, int ex, String info){
        Hero.time.addTime(60);
        Hero.level.xpEarn(xp);

        Hero.hunger += h;
        Delta.hunger = "(" + h + ")";

        Hero.rest += r;
        Delta.rest = "(" + (r > 0 ? "+" : "") + r + ")";

        Hero.excitement += ex;
        Delta.excitement = "(" + (ex > 0 ? "+" : "") + ex + ")";
        System.out.print("\n" + info);
    }
}

class Psychology extends Book{
    static String info = "Understand her or become crazy.";
    static int xp = 2;
    static int h = -2;
    static int r = -3;
    static int ex = -2;
}

class Business extends Book{
    static String info = "Get rich or die trying.";
    static int xp = 2;
    static int h = -3;
    static int r = -3;
    static int ex = -1;
}

class Literature extends Book{
    static String info = "To be or not to be... What is the question!";
    static int xp = 1;
    static int h = -1;
    static int r = -1;
    static int ex = +2;
}

class Programming extends Book{
    static String info = "Reading some code...";
    static int xp = 2;
    static int h = -2;
    static int r = -3;
    static int ex = -2;
}

class Arts extends Book{
    static String info = "Life is Art. Naturally.";
    static int xp = 1;
    static int h = -1;
    static int r = +1;
    static int ex = +3;
}
class Economics extends Book {
    static String info = "What mr. Samuelsson said?";
    static int xp = 1;
    static int h = -2;
    static int r = -2;
    static int ex = -1;
}

class Law extends Book {
    static String info = "How to be true in every situation?";
    static int xp = 2;
    static int h = -2;
    static int r = -3;
    static int ex = -3;
}

class BookSwitcher {

    public static void switcher(String chosen){
        switch (chosen.toLowerCase()) {
            case "psychology": Psychology.read(Psychology.xp, Psychology.h, Psychology.r, Psychology.ex, Psychology.info);
                break;
            case "business": Business.read(Business.xp, Business.h, Business.r, Business.ex, Business.info);
                break;
            case "literature": Literature.read(Literature.xp, Literature.h, Literature.r, Literature.ex, Literature.info);
                break;
            case "programming": Programming.read(Literature.xp, Literature.h, Literature.r, Literature.ex, Literature.info);
                break;
            case "arts": Arts.read(Arts.xp, Arts.h, Arts.r, Arts.ex, Arts.info);
                break;
            case "economics": Economics.read(Economics.xp, Economics.h, Economics.r, Economics.ex, Economics.info);
                break;
            case "law": Law.read(Law.xp, Law.h, Law.r, Law.ex, Law.info);
                break;
            default:
                Printer.p("Sorry, there is no such book category. Try again.");
        }
    }
}

class BookList {
    ArrayList<String> bookList = new ArrayList<>();

    public ArrayList<String> getBookList() {
        bookList.add(Psychology.class.getSimpleName());
        bookList.add(Business.class.getSimpleName());
        bookList.add(Literature.class.getSimpleName());
        bookList.add(Programming.class.getSimpleName());
        bookList.add(Arts.class.getSimpleName());
        bookList.add(Economics.class.getSimpleName());
        bookList.add(Law.class.getSimpleName());
        return bookList;
    }

    public void showBookList() {
        getBookList();
        for (String x : bookList)
            System.out.print(x + ", ");
        Printer.p();
    }
}
