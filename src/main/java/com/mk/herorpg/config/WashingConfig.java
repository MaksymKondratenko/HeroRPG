package com.mk.herorpg.config;

import com.mk.herorpg.hero.Action;
import org.springframework.context.annotation.*;
import com.mk.herorpg.actionImpl.washing.*;

import java.util.ArrayList;

@Configuration
@Lazy
public class WashingConfig {
    @Bean
    @DependsOn("washLister")
    public Washing wash() {
        return new Washing();
    }

    @Bean
    public Bath bath(){
        return new Bath();
    }

    @Bean
    public Hair hair(){
        return new Hair();
    }

    @Bean
    public Nails nails(){
        return new Nails();
    }

    @Bean
    public Shower shower(){
        return new Shower();
    }

    @Bean
    public Teeth teeth(){
        return new Teeth();
    }

    @Bean(initMethod = "showWashList")
    @DependsOn("washList")
    @Scope("prototype")
    public WashLister washLister(){
        return new WashLister(washList());
    }

    @Bean
    public ArrayList<Action> washList(){
        ArrayList<Action> list = new ArrayList<>();
        list.add(new Bath());
        list.add(new Hair());
        list.add(new Nails());
        list.add(new Shower());
        list.add(new Teeth());
        return list;
    }
}
