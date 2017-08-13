package food;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Burger extends Food {
    private String info = "The fastest way to get TTT!";
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("1")
    private int xp;
    @Value("30")
    private int hunger;
    @Value("1")
    private int excitement;
    @Value("-1")
    private int money;
    @Value("-0.05f")
    private float fitness;

    public Burger() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getTime() {
        return time;
    }

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

    public String toString() {
        return "Burger";
    }
}