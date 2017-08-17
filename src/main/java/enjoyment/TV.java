package enjoyment;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class TV extends Enjoyment {

    @Value("Watch TV to get stupid.")
    private String info;
    @Value("#{time.addTime(150)}")
    private int time;
    @Value("2")
    private int xp;
    @Value("-2")
    private int hunger;
    @Value("10")
    private int rest;
    @Value("20")
    private int excitement;

    @Override
    public String toString() {
        return "TV";
    }
}