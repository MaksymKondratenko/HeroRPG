package com.mk.herorpg.config;

import com.mk.herorpg.actionimpl.food.*;
import com.mk.herorpg.hero.Action;
import org.springframework.context.annotation.*;

import java.util.ArrayList;

@Configuration
@Lazy
public class FoodConfig {
    @Bean(initMethod = "showFoodList")
    @DependsOn("foodList")
    @Scope("prototype")
    public FoodLister foodLister(){
        return new FoodLister(foodList());
    }

    @Bean
    @DependsOn("foodLister")
    public Food eat(){
        return new Food();
    }

    @Bean
    public Burger burger(){
        return new Burger();
    }

    @Bean
    public Cake cake(){
        return new Cake();
    }

    @Bean
    public Pizza pizza(){
        return new Pizza();
    }

    @Bean
    public Salad salad(){
        return new Salad();
    }

    @Bean
    public Soup soup(){
        return new Soup();
    }

    @Bean
    public ArrayList<Action> foodList(){
        ArrayList<Action> list = new ArrayList<>();
        list.add(new Burger());
        list.add(new Cake());
        list.add(new Pizza());
        list.add(new Salad());
        list.add(new Soup());
        return list;
    }
}
