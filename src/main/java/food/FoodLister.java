package food;

import hero.Action;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class FoodLister {
    public FoodLister() {
    }

    public ArrayList<Action> foodList = new ArrayList<Action>();

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

    public void setFoodList(@Value("{Burger.class, Cake.class, Pizza.class, Salad.class, Soup.class}") ArrayList<Action> foodList) {
        this.foodList = foodList;
    }

}