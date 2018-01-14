package com.mk.herorpg.actionimpl.washing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Shower extends Washing {

    @Value("Take a shower")
    private String id;
    @Value("Fast food in bathing.")
    private String info;
    @Value("#{time.addTime(30)}")
    private int time;
    @Value("2")
    private int appeal;

    @Override
    public String toString() {
        return "Shower";
    }
}