package food;

import hero.Action;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class FoodLister {
    public FoodLister() {
    }
    public FoodLister(ArrayList<Action> list){
        foodList = list;
    }

    public ArrayList<Action> foodList;

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