package activities;

import hero.Action;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

public @Getter @Setter class Dream extends Action {
    @Value("#{time.addTime(360)}")
    private int time;
    @Value("-5")
    private int hunger;
    @Value("50")
    private int rest;
}