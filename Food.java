package Hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 21.02.2017.
 */
interface Food {
    String id = "Food";
    String name = "Mmm... Tasty!";
    static void eat(){};
}

class Burger implements Food{
    static String id = "Burger";
    static String name = "The fastest way to get TTT!";

    public static void eat(){
        Hero.money -= 1;
        Hero.time.addTime(10);
        Hero.hunger += 30;
        Hero.excitement +=1;
        Printer.p();
        Printer.p(name);
    }
}

class Pizza implements Food{
    static String id = "Pizza";
    static String name = "Taste the Italy!";

    public static void eat(){
        Hero.money -= 3;
        Hero.time.addTime(30);
        Hero.hunger += 50;
        Hero.excitement +=3;
        Printer.p();
        Printer.p(name);
    }
}

class Salad implements Food{
    static String id = "Salad";
    static String name = "Eat me, get fit!";

    public static void eat(){
        Hero.money -= 2;
        Hero.time.addTime(15);
        Hero.hunger += 10;
        Hero.excitement +=3;
        Hero.fitness += 0.05f;
        Printer.p();
        Printer.p(name);
    }
}

class Soup implements Food{
    static String id = "Soup";
    static String name = "Hot & tasty!";

    public static void eat(){
        Hero.money -= 1;
        Hero.time.addTime(30);
        Hero.hunger += 25;
        Hero.excitement +=1;
        Printer.p();
        Printer.p(name);
    }
}

class Cake implements Food{
    static String id = "Cake";
    static String name = "Delicious way to spend your life!";

    public static void eat(){
        Hero.money -= 3;
        Hero.time.addTime(45);
        Hero.hunger += 40;
        Hero.excitement +=10;
        Hero.fitness -= 0.1f;
        Printer.p();
        Printer.p(name);
    }
}

class FoodSwitcher {

    public static void switcher(String chosen){
        switch (chosen) {
            case "burger": Burger.eat();
                break;
            case "pizza": Pizza.eat();
                break;
            case "salad": Salad.eat();
                break;
            case "soup": Soup.eat();
                break;
            case "cake": Cake.eat();
                break;
            default:
                Printer.p("Sorry, but you have no thoughts, where to buy this. Try again.");
        }
    }
}

class FoodList {
    ArrayList<String> foodList = new ArrayList<>();

    public ArrayList<String> getFoodList(){
        foodList.add(Burger.id);
        foodList.add(Pizza.id);
        foodList.add(Salad.id);
        foodList.add(Soup.id);
        foodList.add(Cake.id);
        return foodList;
    }

    public void showFoodList(){
        getFoodList();
        for (String x : foodList)
            System.out.print(x + ", ");
        Printer.p();
    }
}