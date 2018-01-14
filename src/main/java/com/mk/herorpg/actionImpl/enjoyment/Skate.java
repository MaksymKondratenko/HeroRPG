package com.mk.herorpg.actionimpl.enjoyment;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Skate extends Enjoyment{

    @Value("Off the wall!")
    private String info;
    @Value("#{time.addTime(30)}")
    private int time;
    @Value("2")
    private int xp;
    @Value("-15")
    private int hunger;
    @Value("10")
    private int rest;
    @Value("25")
    private int excitement;

    @Override
    public String toString() {
        return "Skate";
    }
}