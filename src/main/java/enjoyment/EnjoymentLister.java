package enjoyment;

import hero.Action;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
@Component
public class EnjoymentLister {
    @Value("${Cinema.class, Dance.class, Enjoyment.class, Skate.class, Theater.class, TV.class}")
    private ArrayList<Action> enjoymentList;

    public EnjoymentLister() {
    }

    public ArrayList<Action> getEnjoymentList() {
        return enjoymentList;
    }

    @PostConstruct
    public void showEnjoymentList() {
        getEnjoymentList();
        System.out.println("Choose and type, where to go to entertain yourself:");
        for (Action x : enjoymentList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }


    public void setEnjoymentList(ArrayList<Action> enjoyList) {
        this.enjoymentList = enjoyList;
    }
}