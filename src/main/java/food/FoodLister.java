package food;

import hero.Action;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class FoodLister {
    @Getter @Setter
    public ArrayList<Action> foodList;

    public FoodLister() {}
    public FoodLister(ArrayList<Action> list){
        foodList = list;
    }

    public void showFoodList(){
        getFoodList();
        System.out.println("Choose and type, what meal you want to eat:");
        for (Action x : foodList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }
}