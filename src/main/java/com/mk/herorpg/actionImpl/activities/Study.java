package com.mk.herorpg.actionimpl.activities;

import com.mk.herorpg.hero.Action;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Study extends Action {

    @Value("#{time.addTime(360)}")
    private int time;
    @Value("5")
    private int xp;
    @Value("-20")
    private int hunger;
    @Value("-15")
    private int rest;
    @Value("-20")
    private int excitement;
    @Value("0.05f")
    private float studyingProcess;

    @Override
    public String toString() {
        return "Studying";
    }
}