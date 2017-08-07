package activities;

import hero.Action;
import hero.Girl;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
@Component
public class Date extends Action {
    Girl girl;

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

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }
}
