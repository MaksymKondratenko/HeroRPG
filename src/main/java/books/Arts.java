package books;

import org.springframework.beans.factory.annotation.Value;

public class Arts extends Book {
    private String info = "Life is Art. Naturally.";
    @Value("#{time.addTime(60)}")
    private int time;
    @Value("1")
    private int xp;
    @Value("-1")
    private int hunger;
    @Value("1")
    private int rest;
    @Value("3")
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
        return "Arts";
    }
}