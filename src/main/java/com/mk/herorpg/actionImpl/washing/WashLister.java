package com.mk.herorpg.actionimpl.washing;

import com.mk.herorpg.hero.Action;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
public class WashLister {

    @Getter @Setter
    private ArrayList<Action> washList;

    public void showWashList(){
        getWashList();
        System.out.println("Choose and type, what you are going to handle with:");
        washList.forEach(x -> System.out.println(x + ", "));
        System.out.println("\n");
    }
}