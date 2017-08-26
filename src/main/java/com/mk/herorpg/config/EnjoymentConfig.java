package com.mk.herorpg.config;

import com.mk.herorpg.actionImpl.enjoyment.*;
import com.mk.herorpg.hero.Action;
import org.springframework.context.annotation.*;

import java.util.ArrayList;

@Configuration
@Lazy
public class EnjoymentConfig {
    @Bean(initMethod = "showEnjoymentList")
    @DependsOn("enjoymentList")
    @Scope("prototype")
    public EnjoymentLister enjoymentLister() {
        return new EnjoymentLister(enjoymentList());
    }

    @Bean
    @DependsOn("enjoymentLister")
    @Scope("prototype")
    public Enjoyment enjoy() {
        return new Enjoyment();
    }

    @Bean
    public Cinema cinema() {
        return new Cinema();
    }

    @Bean
    public Dance dance() {
        return new Dance();
    }

    @Bean
    public Skate skate() {
        return new Skate();
    }

    @Bean
    public Theater theater(){
        return new Theater();
    }

    @Bean
    public TV tv(){
        return new TV();
    }

    @Bean
    public ArrayList<Action> enjoymentList(){
        ArrayList<Action> list = new ArrayList<>();
        list.add(new Cinema());
        list.add(new Dance());
        list.add(new Skate());
        list.add(new Theater());
        list.add(new TV());
        return list;
    }
}
