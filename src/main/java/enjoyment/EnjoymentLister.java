package enjoyment;

import hero.Action;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class EnjoymentLister {
    private ArrayList<Action> enjoymentList = new ArrayList<>();

    public EnjoymentLister() {
    }

    public ArrayList<Action> getEnjoymentList() {
        return enjoymentList;
    }

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