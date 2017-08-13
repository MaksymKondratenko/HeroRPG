package food;

import hero.Action;
import hero.Level;
import org.springframework.stereotype.Component;

/**
 * Created by Maksym on 21.02.2017.
 */
@Component
public class Food extends Action {
    private int time;
    private int xp;
    private Level level;
    private int hunger;
    private int rest;
    private int excitement;
    private int appeal;
    private int money;
    private float studyingProcess;
    private float fitness;
    public Food() {
    }

}
