package hero;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Maksym on 14.02.2017.
 */
@Component
public class Hero {
    @Value("Sir Lancelot")
    private String name;
    @Value("0")
    private int xp;
    @Value("100")
    private int hunger;
    @Value("100")
    private int rest;
    @Value("100")
    private int excitement;
    @Value("0")
    private int appeal;
    @Value("10")
    private int money;
    @Value("0.0f")
    private float studyingProcess;
    @Value("0.0f")
    private float fitness;
    private Level level = new Level();

    public Hero() {
    }

    public Hero( String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }


    public void setXp(int xp) {
        this.xp = xp;
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

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}