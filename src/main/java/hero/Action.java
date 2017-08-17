package hero;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Action{
    private int time;
    private int xp;
    private int hunger;
    private int rest;
    private int excitement;
    private int appeal;
    private int money;
    private float studyingProcess;
    private float fitness;
}
