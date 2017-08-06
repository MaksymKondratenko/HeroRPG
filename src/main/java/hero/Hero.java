package hero;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Maksym on 14.02.2017.
 */
public class Hero {
    private static Hero singleHero;
    private String name = "Sir Lancelot";
    private int xp = 0;
    private int hunger = 100;
    private int rest = 100;
    private int excitement = 100;
    private int appeal = 0;
    private int money = 10;
    private float studyingProcess = 0.0f;
    private float fitness = 0.0f;
    private Level level = new Level();

    @Autowired
    public Hero() {
    }

    public Hero( String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    @Autowired
    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHunger() {
        return hunger;
    }

    @Autowired
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getRest() {
        return rest;
    }

    @Autowired
    public void setRest(int rest) {
        this.rest = rest;
    }

    public int getExcitement() {
        return excitement;
    }

    @Autowired
    public void setExcitement(int excitement) {
        this.excitement = excitement;
    }

    public int getAppeal() {
        return appeal;
    }

    @Autowired
    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    public int getMoney() {
        return money;
    }

    @Autowired
    public void setMoney(int money) {
        this.money = money;
    }

    public float getStudyingProcess() {
        return studyingProcess;
    }

    @Autowired
    public void setStudyingProcess(float studyingProcess) {
        this.studyingProcess = studyingProcess;
    }

    public float getFitness() {
        return fitness;
    }

    @Autowired
    public void setFitness(float fitness) {
        this.fitness = fitness;
    }

    public Level getLevel() {
        return level;
    }

    @Autowired
    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }
}
