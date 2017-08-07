package hero;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Maksym on 17.02.2017.
 */
@Component
public class Girl {
    private String name;
    private Random lucky;

    public Girl() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Random getLucky() {
        return lucky;
    }

    public void setLucky(Random lucky) {
        this.lucky = lucky;
    }
}
