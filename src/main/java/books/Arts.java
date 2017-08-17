package books;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Arts extends Book {

    @Value("Life is Art. Naturally.")
    private String info;
    @Value("#{time.addTime(60)}")
    private int time;
    @Value("1")
    private int xp;
    @Value("-1")
    private int hunger;
    @Value("1")
    private int rest;
    @Value("3")
    private int excitement;

    @Override
    public String toString() {
        return "Arts";
    }
}