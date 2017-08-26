package com.mk.herorpg.actionImpl.books;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Literature extends Book {

    @Value("To be or not to be... What is the question!")
    private String info;
    @Value("#{time.addTime(60)}")
    private int time;
    @Value("1")
    private int xp;
    @Value("-1")
    private int hunger;
    @Value("-1")
    private int rest;
    @Value("2")

    @Override
    public String toString() {
        return "Literature";
    }
}