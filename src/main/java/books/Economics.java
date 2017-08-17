package books;

import hero.Level;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Economics extends Book {

    @Value("What did mr. Samuelsson said?")
    private String info;
    @Value("#{time.addTime(60)}")
    private int time;
    @Value("1")
    private int xp;
    private Level level;
    @Value("-2")
    private int hunger;
    @Value("-2")
    private int rest;
    @Value("-1")
    private int excitement;

    @Override
    public String toString() {
        return "Economics";
    }
}