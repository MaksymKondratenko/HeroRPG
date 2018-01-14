package com.mk.herorpg.actionimpl.food;

import com.mk.herorpg.hero.Action;
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
        foodList.forEach(x -> System.out.println(x + ", "));
        System.out.println("\n");
    }
}