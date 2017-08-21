package activities;

import hero.Action;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Work extends Action {

    @Value("#{time.addTime(480)}")
    private int time;
    @Value("5")
    private int xp;
    @Value("-20")
    private int hunger;
    @Value("-20")
    private int rest;
    @Value("20")
    private int excitement;
    @Value("10")
    private int money;

    @Override
    public String toString(){
        return "Working";
    }
}