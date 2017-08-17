package washing;

import hero.Action;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class WashLister {

    @Getter @Setter
    private ArrayList<Action> washList;

    public WashLister() {}
    public WashLister(ArrayList<Action> list){
        washList = list;
    }

    public void showWashList(){
        getWashList();
        System.out.println("Choose and type, what you are going to handle with:");
        for (Action x : washList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }
}