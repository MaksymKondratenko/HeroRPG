package config;

import food.*;
import org.springframework.context.annotation.*;

@Configuration
@Lazy
public class FoodConfig {
    @Bean(initMethod = "showFoodList")
    @Scope("prototype")
    public FoodLister foodLister(){
        return new FoodLister();
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

}
