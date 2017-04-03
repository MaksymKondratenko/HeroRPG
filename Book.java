package Hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 21.02.2017.
 */
interface Book {
    String id = "Book";
    String name = "Get smarter, guy!";
    static void read(){};
}

class Psychology implements Book{
    static String id = "Psychology";
    static String name = "Understand her or become crazy.";

    public static void read(){
        Hero.time.addTime(60);
        Hero.level.xpEarn(2);
        Hero.hunger -= 2;
        Hero.rest -= 3;
        Hero.excitement -= 2;
        Printer.p();
        Printer.p(name);
    }
}

class Business implements Book{
    static String id = "Business";
    static String name = "Get rich or die trying.";

    public static void read(){
        Hero.time.addTime(60);
        Hero.level.xpEarn(2);
        Hero.hunger -= 3;
        Hero.rest -= 3;
        Hero.excitement -= 1;;
        Printer.p();
        Printer.p(name);
    }
}

class Literature implements Book{
    static String id = "Literature";
    static String name = "To be or not to be... What is the question!";

    public static void read(){
        Hero.time.addTime(60);
        Hero.level.xpEarn(1);
        Hero.hunger -= 1;
        Hero.rest -= 1;
        Hero.excitement += 2;
        Printer.p();
        Printer.p(name);
    }
}

class Programming implements Book{
    static String id = "Programming";
    static String name = "Reading some code...";

    public static void read(){
        Hero.time.addTime(60);
        Hero.level.xpEarn(2);
        Hero.hunger -= 2;
        Hero.rest -= 3;
        Hero.excitement -= 2;
        Printer.p();
        Printer.p(name);
    }
}

class Arts implements Book{
    static String id = "Arts";
    static String name = "Life is Art. Naturally.";

    public static void read(){
        Hero.time.addTime(60);
        Hero.level.xpEarn(1);
        Hero.hunger -= 1;
        Hero.rest += 1;
        Hero.excitement += 3;
        Printer.p();
        Printer.p(name);
    }
}
class Economics implements Book{
    static String id = "Economics";
    static String name = "What mr. Samuelsson said?";

    public static void read(){
        Hero.time.addTime(60);
        Hero.level.xpEarn(1);
        Hero.hunger -= 2;
        Hero.rest -= 2;
        Hero.excitement -= 1;
        Printer.p();
        Printer.p(name);
    }
}

class Law implements Food{
    static String id = "Law";
    static String name = "How to be true in every situation?";

    public static void read(){
        Hero.time.addTime(60);
        Hero.level.xpEarn(2);
        Hero.hunger -= 2;
        Hero.rest -= 3;
        Hero.excitement -= 3;
        Printer.p();
        Printer.p(name);
    }
}

class BookSwitcher {

    public static void switcher(String chosen){
        switch (chosen) {
            case "psychology": Psychology.read();
                break;
            case "business": Business.read();
                break;
            case "literature": Literature.read();
                break;
            case "programming": Programming.read();
                break;
            case "arts": Arts.read();
                break;
            case "economics": Economics.read();
                break;
            case "law": Law.read();
                break;
            default:
                Printer.p("Sorry, there is no such book category. Try again.");
        }
    }
}

class BookList {
    ArrayList<String> bookList = new ArrayList<>();

    public ArrayList<String> getBookList() {
        bookList.add(Psychology.id);
        bookList.add(Business.id);
        bookList.add(Literature.id);
        bookList.add(Programming.id);
        bookList.add(Arts.id);
        bookList.add(Economics.id);
        bookList.add(Law.id);
        return bookList;
    }

    public void showBookList() {
        getBookList();
        for (String x : bookList)
            System.out.print(x + ", ");
        Printer.p();
    }
}
