package food;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Salad extends Food {

    @Value( "Eat me, get fit!")
    private String info;
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("1")
    private int xp;
    @Value("10")
    private int hunger;
    @Value("1")
    private int excitement;
    @Value("-2")
    private int money;
    @Value("0.02f")
    private float fitness;

    @Override
    public String toString() {
        return "Salad";
    }
}