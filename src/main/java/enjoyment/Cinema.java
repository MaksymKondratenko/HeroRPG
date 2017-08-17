package enjoyment;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

public @Getter @Setter class Cinema extends Enjoyment{

    @Value("What movie is on screen now?")
    private String info;
    @Value("#{time.addTime(120)}")
    private int time;
    @Value("6")
    private int xp;
    @Value("-8")
    private int hunger;
    @Value("5")
    private int rest;
    @Value("30")
    private int excitement;
    @Value("-2")
    private int money;

    @Override
    public String toString() {
        return "Cinema";
    }

}