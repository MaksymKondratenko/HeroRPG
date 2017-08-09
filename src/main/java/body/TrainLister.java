package body;

import hero.Action;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
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

    public void setTrainList(@Value("{Back.class, Bicep.class, Legs.class, Neck.class, Press.class}") ArrayList<Action> trainList) {
        this.trainList = trainList;
    }
}