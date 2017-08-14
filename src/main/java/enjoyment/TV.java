package enjoyment;

import org.springframework.beans.factory.annotation.Value;

public class TV extends Enjoyment {
    private String info = "Watch TV to get stupid.";
    @Value("#{time.addTime(150)}")
    private int time;
    @Value("2")
    private int xp;
    @Value("-2")
    private int hunger;
    @Value("10")
    private int rest;
    @Value("20")
    private int excitement;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int getXp() {
        return xp;
    }

    @Override
    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public int getRest() {
        return rest;
    }

    @Override
    public void setRest(int rest) {
        this.rest = rest;
    }

    @Override
    public int getExcitement() {
        return excitement;
    }

    @Override
    public void setExcitement(int excitement) {
        this.excitement = excitement;
    }

    @Override
    public String toString() {
        return "TV";
    }
}