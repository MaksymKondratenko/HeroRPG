package com.mk.herorpg.actionimpl.washing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Hair extends Washing {

    @Value("Grass hair")
    private String id;
    @Value("Stylish look!")
    private String info;
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("1")
    private int appeal;

    @Override
    public String toString() {
        return "Hair";
    }
}