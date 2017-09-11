package com.mk.herorpg.hero;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter //lombok provides all getters and setters
public class Action {

    private int time;
    private int xp;
    private int hunger;
    private int rest;
    private int excitement;
    private int appeal;
    private int money;
    private float studyingProcess;
    private float fitness;
    private String name;

    public String toString() {
        return "Action";
    }
}
