package enjoyment;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Dance extends Enjoyment{

    @Value("I'd like to move it, move it...")
    private String info;
    @Value("#{time.addTime(30)}")
    private int time;
    @Value("1")
    private int xp;
    @Value("-10")
    private int hunger;
    @Value("5")
    private int rest;
    @Value("30")
    private int excitement;

    @Override
    public String toString() {
        return "Dance";
    }
}