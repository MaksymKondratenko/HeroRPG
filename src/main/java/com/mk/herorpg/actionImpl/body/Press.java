package com.mk.herorpg.actionimpl.body;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Press extends Body {

    private String info = "Crush all received punches for ease.";
    @Value("#{time.addTime(30)}")
    private int time;
    @Value("-10")
    private int hunger;
    @Value("-15")
    private int rest;
    @Value("-5")
    private int excitement;
    @Value("-1")
    private int money;
    @Value("0.05f")
    private float fitness;

    @Override
    public String toString() {
        return "Press";
    }
}