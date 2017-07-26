package body;

import hero.Action;

import java.util.ArrayList;

public class TrainLister {
    private ArrayList<Action> trainList = new ArrayList<>();

    public TrainLister() {
    }

    public ArrayList<Action> getTrainList (){
        return trainList;
    }

    public void showTrainList(){
        getTrainList();
        System.out.println("Choose and type, what part of your body you want to train:");
        for (Action x : trainList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }

    public void setTrainList(ArrayList<Action> trainList) {
        this.trainList = trainList;
    }
}