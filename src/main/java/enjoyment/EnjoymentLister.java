package enjoyment;

import hero.Action;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class EnjoymentLister {
    @Getter @Setter
    private ArrayList<Action> enjoymentList;

    public EnjoymentLister(){}
    public EnjoymentLister(ArrayList<Action> list) {
        enjoymentList = list;
    }

    public void showEnjoymentList() {
        getEnjoymentList();
        System.out.println("Choose and type, where to go to entertain yourself:");
        for (Action x : enjoymentList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }
}