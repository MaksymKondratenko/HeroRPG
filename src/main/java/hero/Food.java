package hero;

import java.util.ArrayList;

/**
 * Created by Maksym on 21.02.2017.
 */
class Food {
    public static void eat(int m, int x, int h, int ex, float f, String info){
        if(Hero.money + m < 0) {
            System.out.print("Sorry, not enough money. Work to earn more.");
            Delta.money = null;
            Delta.hunger = null;
            Delta.excitement = null;
            Delta.fitness = null;
        } else if (Hero.fitness + f < -0.1f) {
            System.out.print("Wow, please abstain of it. Your health is to bad. Train yourself or eat some salad.\n");
            Printer.printFitness();

            Delta.money = null;
            Delta.hunger = null;
            Delta.excitement = null;
            Delta.fitness = null;
        } else {
            Hero.money += m;
            Delta.money = "(" + m + ")";
            Hero.time.addTime(15 * x);

            Hero.hunger += h;
            Delta.hunger = "(+" + h + ")";

            Hero.excitement += ex;
            Delta.excitement = "(+" + ex + ")";

            Hero.fitness += f;
            Delta.fitness = "(" + (f > 0 ? "+" : "") + f + ")";
            System.out.print("Eating...\n" + info + "\n");
            Printer.printStats();
            System.out.print("Eaten!" + f + "\n");
        }
    }
}

class Burger extends Food {
    static String info = "The fastest way to get TTT!";
    static int m = -1;
    static int x = 1;
    static int h = 30;
    static int ex = 1;
    static float f = -0.05f;
}

class Pizza extends Food{
    static String info = "Taste the Italy!";
    static int m = -3;
    static int x = 2;
    static int h = 50;
    static int ex = 3;
    static float f = -0.02f;
}

class Salad extends Food{
    static String info = "Eat me, get fit!";
    static int m = -2;
    static int x = 1;
    static int h = 10;
    static int ex = 1;
    static float f = 0.05f;
}

class Soup extends Food{
    static String info = "Hot & tasty!";
    static int m = -1;
    static int x = 2;
    static int h = 25;
    static int ex = 1;
    static float f = 0.00f;
}

class Cake extends Food{
    static String info = "Delicious way to spend your life!";
    static int m = -3;
    static int x = 3;
    static int h = 40;
    static int ex = 10;
    static float f = -0.05f;
}

class FoodSwitcher {

    public static void switcher(String chosen){
        switch (chosen.toLowerCase()) {
            case "burger": Burger.eat(Burger.m, Burger.x, Burger.h, Burger.ex, Burger.f, Burger.info);
                break;
            case "pizza": Pizza.eat(Pizza.m, Pizza.x, Pizza.h, Pizza.ex, Pizza.f, Pizza.info);
                break;
            case "salad": Salad.eat(Salad.m, Salad.x, Salad.h, Salad.ex, Salad.f, Salad.info);
                break;
            case "soup": Soup.eat(Soup.m, Soup.x, Soup.h, Soup.ex, Soup.f, Soup.info);
                break;
            case "cake": Cake.eat(Cake.m, Cake.x, Cake.h, Cake.ex, Cake.f, Cake.info);
                break;
            default:
                Printer.p("Sorry, but you have no thoughts, where to buy this. Try again.");
        }
    }
}

class FoodList {
    ArrayList<String> foodList = new ArrayList<>();

    public ArrayList<String> getFoodList(){
        foodList.add(Burger.class.getSimpleName());
        foodList.add(Pizza.class.getSimpleName());
        foodList.add(Salad.class.getSimpleName());
        foodList.add(Soup.class.getSimpleName());
        foodList.add(Cake.class.getSimpleName());
        return foodList;
    }

    public void showFoodList(){
        getFoodList();
        for (String x : foodList)
            System.out.print(x + ", ");
        Printer.p();
    }
}