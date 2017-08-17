package body;

import hero.Action;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class TrainLister {
    @Getter @Setter
    private ArrayList<Action> trainList = new ArrayList<>();

    public TrainLister() {}
    public TrainLister(ArrayList<Action> list){
        trainList = list;
    }

    public void showTrainList(){
        getTrainList();
        System.out.println("Choose and type, what part of your body you want to train:");
        for (Action x : trainList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }
}