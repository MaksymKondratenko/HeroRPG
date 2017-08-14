package activities;

import hero.Action;
import org.springframework.beans.factory.annotation.Value;

public class Study extends Action {
    @Value("#{time.addTime(360)}")
    private int time;
    @Value("5")
    private int xp;
    @Value("-20")
    private int hunger;
    @Value("-15")
    private int rest;
    @Value("-20")
    private int excitement;
    @Value("0.05f")
    private float studyingProcess;

    public Study() {
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
    public float getStudyingProcess() {
        return studyingProcess;
    }

    @Override
    public void setStudyingProcess(float studyingProcess) {
        this.studyingProcess = studyingProcess;
    }
}