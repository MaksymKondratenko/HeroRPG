package books;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Programming extends Book {
    @Value("Reading some code...")
    private String info;
    @Value("#{time.addTime(60)}")
    private int time;
    @Value("2")
    private int xp;
    @Value("-2")
    private int hunger;
    @Value("-3")
    private int rest;
    @Value("-2")
    private int excitement;

    @Override
    public String toString() {
        return "Programming";
    }
}