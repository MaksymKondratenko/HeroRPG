package food;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cake extends Food{
    private String info = "Delicious way to spend your life!";
    @Value("#{time.addTime(30)}")
    private int time;
    @Value("3")
    private int xp;
    @Value("40")
    private int hunger;
    @Value("10")
    private int excitement;
    @Value("-3")
    private int money;
    @Value("-0.05f")
    private float fitness;

    public Cake() {
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
        return "Cake";
    }
}