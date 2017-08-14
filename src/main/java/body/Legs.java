package body;

import org.springframework.beans.factory.annotation.Value;

public class Legs extends Body {
    private String info = "Run, Forrest, run!.";
    @Value("#{time.addTime(30)}")
    private int time;
    @Value("-10")
    private int hunger;
    @Value("-15")
    private int rest;
    @Value("-5")
    private int excitement;
    @Value("-1")
    private int money;
    @Value("0.05f")
    private float fitness;

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setTime(int time) {
        this.time = time;
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
    public int getMoney() {
        return money;
    }

    @Override
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public float getFitness() {
        return fitness;
    }

    @Override
    public void setFitness(float fitness) {
        this.fitness = fitness;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String toString() {
        return "Legs";
    }
}