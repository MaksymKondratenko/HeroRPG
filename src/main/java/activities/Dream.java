package activities;

import hero.Action;
import org.springframework.beans.factory.annotation.Value;

public class Dream extends Action {
    @Value("#{time.addTime(360)}")
    private int time;
    @Value("-5")
    private int hunger;
    @Value("50")
    private int rest;

    public Dream() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }
}