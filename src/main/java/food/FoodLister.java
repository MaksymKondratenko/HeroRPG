package food;

import hero.Action;

import java.util.ArrayList;

public class FoodLister {
    public FoodLister() {
    }

    public ArrayList<Action> foodList = new ArrayList<>();

    public ArrayList<Action> getFoodList(){
        return foodList;
    }

    public void showFoodList(){
        getFoodList();
        System.out.println("Choose and type, what meal you want to eat:");
        for (Action x : foodList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }

    public void setFoodList(ArrayList<Action> foodList) {
        this.foodList = foodList;
    }

}