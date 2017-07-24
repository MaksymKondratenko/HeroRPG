package hero;

import java.util.Random;

/**
 * Created by Maksym on 17.02.2017.
 */
public class Girl {
    String name;
    Random lucky;

    Girl(String name){
        this.name = name;
        this.lucky = new Random();
    }

}
