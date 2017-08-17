package food;

import hero.Action;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
public class FoodLister {

    @Getter @Setter
    public ArrayList<Action> foodList;

    public void showFoodList(){
        getFoodList();
        System.out.println("Choose and type, what meal you want to eat:");
        for (Action x : foodList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }
}