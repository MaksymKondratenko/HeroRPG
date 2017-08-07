package activities;

import hero.Action;
import hero.Level;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dream extends Action {
    @Value("#{time.addTime(360)}")
    private int time;
    private int xp;
    private Level level;
    @Value("-5")
    private int hunger;
    @Value("50")
    private int rest;
    private int excitement;
    private int appeal;
    private int money;
    private float studyingProcess;
    private float fitness;

    public Dream() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
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

    public int getExcitement() {
        return excitement;
    }

    public void setExcitement(int excitement) {
        this.excitement = excitement;
    }

    public int getAppeal() {
        return appeal;
    }

    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public float getStudyingProcess() {
        return studyingProcess;
    }

    public void setStudyingProcess(float studyingProcess) {
        this.studyingProcess = studyingProcess;
    }

    public float getFitness() {
        return fitness;
    }

    public void setFitness(float fitness) {
        this.fitness = fitness;
    }
}
