package com.mk.herorpg.actionImpl.activities;

import com.mk.herorpg.hero.Action;
import com.mk.herorpg.hero.Girl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

@AllArgsConstructor
public class Date extends Action {

    @Getter @Setter
    private Girl girl;

    public void date() throws IOException {
        System.out.println("You are going to hunt a new chick. Who'd be next? (Tip: type her name.)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        girl.setName(br.readLine());
        girl.setLucky(new Random());
        if (girl.getLucky().nextInt(2) == 1)
            System.out.println("You've found a couple! Her name is " + girl.getName());
        else
            System.out.println("Not your time, bro.");
    }

    @Override
    public String toString() {
        return "Dating a girl";
    }
}
