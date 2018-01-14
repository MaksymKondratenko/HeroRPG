package com.mk.herorpg.config;

import com.mk.herorpg.actionimpl.body.*;
import com.mk.herorpg.hero.Action;
import org.springframework.context.annotation.*;

import java.util.ArrayList;

@Configuration
@Lazy
public class TrainConfig {
    @Bean(initMethod = "showTrainList")
    @DependsOn("trainList")
    @Scope("prototype")
    public TrainLister trainLister(){
        return new TrainLister(trainList());
    }

    @Bean
    @DependsOn("trainLister")
    @Scope("prototype")
    public Body train(){
        return new Body();
    }

    @Bean
    public Bicep bicep(){
        return new Bicep();
    }

    @Bean
    public Back back(){
        return new Back();
    }

    @Bean
    public Legs legs(){
        return new Legs();
    }

    @Bean
    public Neck neck(){
        return new Neck();
    }

    @Bean
    public Press press(){
        return new Press();
    }

    @Bean
    public ArrayList<Action> trainList(){
        ArrayList<Action> list = new ArrayList<>();
        list.add(new Back());
        list.add(new Bicep());
        list.add(new Legs());
        list.add(new Neck());
        list.add(new Press());
        return list;
    }
}
