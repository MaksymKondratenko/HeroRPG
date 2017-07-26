package washing;

import hero.Action;

import java.util.ArrayList;

public class WashLister {
    private ArrayList<Action> washList = new ArrayList<>();

    public WashLister() {
    }

    public ArrayList<Action> getWashList(){
        return washList;
    }

    public void showWashList(){
        getWashList();
        System.out.println("Choose and type, what you are going to handle with:");
        for (Action x : washList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }

    public void setWashList(ArrayList<Action> washList) {
        this.washList = washList;
    }
}