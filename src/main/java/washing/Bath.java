package washing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Bath extends Washing {

    @Value("Take a bath")
    private String id;
    @Value("Better to use a salt bomb.")
    private String info;
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("3")
    private int appeal;

    @Override
    public String toString() {
        return "Bath";
    }
}