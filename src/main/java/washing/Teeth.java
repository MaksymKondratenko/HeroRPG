package washing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Teeth extends Washing {
    @Value("Wash teeth")
    private String id;
    @Value("Goal is to have a Hollywood smile.")
    private String info;
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("1")
    private int appeal;

    @Override
    public String toString() {
        return "Teeth";
    }
}