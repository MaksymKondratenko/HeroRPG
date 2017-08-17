package food;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

public @Getter @Setter class Burger extends Food {

    @Value("The fastest way to get TTT!")
    private String info;
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("1")
    private int xp;
    @Value("30")
    private int hunger;
    @Value("1")
    private int excitement;
    @Value("-1")
    private int money;
    @Value("-0.05f")
    private float fitness;

    @Override
    public String toString() {
        return "Burger";
    }
}