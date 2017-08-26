package com.mk.herorpg.actionImpl.food;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Cake extends Food{

    @Value("Delicious way to spend your life!")
    private String info;
    @Value("#{time.addTime(30)}")
    private int time;
    @Value("3")
    private int xp;
    @Value("40")
    private int hunger;
    @Value("10")
    private int excitement;
    @Value("-3")
    private int money;
    @Value("-0.05f")
    private float fitness;

    @Override
    public String toString() {
        return "Cake";
    }
}