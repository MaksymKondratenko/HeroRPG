package com.mk.herorpg.actionImpl.body;

import com.mk.herorpg.hero.Action;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
public class TrainLister {

    @Getter @Setter
    private ArrayList<Action> trainList = new ArrayList<>();

    public void showTrainList(){
        getTrainList();
        System.out.println("Choose and type, what part of your com.mk.herorpg.actionImpl.body you want to train:");
        for (Action x : trainList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }
}