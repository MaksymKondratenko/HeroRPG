package com.mk.herorpg.actionimpl.food;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Soup extends Food {

    @Value("Go and develop yourself culturally!")
    private String info = "Hot & tasty!";
    @Value("#{time.addTime(30)}")
    private int time;
    @Value("2")
    private int xp;
    @Value("25")
    private int hunger;
    @Value("1")
    private int excitement;
    @Value("-1")
    private int money;

    @Override
    public String toString() {
        return "Soup";
    }
}