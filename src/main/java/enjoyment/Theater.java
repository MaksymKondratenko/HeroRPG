package enjoyment;

import hero.Level;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Theater extends Enjoyment{
    private String info = "Go and develop yourself culturally!";
    @Value("#{time.addTime(180)")
    private int time;
    @Value("4")
    private int xp;
    private Level level;
    @Value("-5")
    private int hunger;
    @Value("25")
    private int rest;
    @Value("40")
    private int excitement;
    private int appeal;
    @Value("-3")
    private int money;
    private float studyingProcess;
    private float fitness;

    public Theater() {
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

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
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
    public int getAppeal() {
        return appeal;
    }

    @Override
    public void setAppeal(int appeal) {
        this.appeal = appeal;
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
    public float getStudyingProcess() {
        return studyingProcess;
    }

    @Override
    public void setStudyingProcess(float studyingProcess) {
        this.studyingProcess = studyingProcess;
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
        return "Theater";
    }
}