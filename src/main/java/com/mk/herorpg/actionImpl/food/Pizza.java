package com.mk.herorpg.actionImpl.food;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Pizza extends Food {

    @Value("Taste the Italy!")
    private String info;
    @Value("#{time.addTime(45)}")
    private int time;
    @Value("2")
    private int xp;
    @Value("50")
    private int hunger;
    @Value("3")
    private int excitement;
    @Value("-4")
    private int money;
    @Value("-0.02f")
    private float fitness;

    @Override
    public String toString() {
        return "Pizza";
    }
}