package com.mk.herorpg.actionImpl.washing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Nails extends Washing {

    @Value("Cut nails")
    private String id;
    @Value("Time to cut your cat nails!")
    private String info;
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("1")
    private int appeal;

    @Override
    public String toString() {
        return "Nails";
    }
}