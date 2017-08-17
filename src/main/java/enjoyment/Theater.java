package enjoyment;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Theater extends Enjoyment{

    @Value("Go and develop yourself culturally!")
    private String info;
    @Value("#{time.addTime(180)}")
    private int time;
    @Value("4")
    private int xp;
    @Value("-5")
    private int hunger;
    @Value("25")
    private int rest;
    @Value("40")
    private int excitement;
    @Value("-3")
    private int money;

    @Override
    public String toString() {
        return "Theater";
    }
}