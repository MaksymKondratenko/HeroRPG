package com.mk.herorpg.actionImpl.enjoyment;

import com.mk.herorpg.hero.Action;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
public class EnjoymentLister {

    @Getter @Setter
    private ArrayList<Action> enjoymentList;

    public void showEnjoymentList() {
        getEnjoymentList();
        System.out.println("Choose and type, where to go to entertain yourself:");
        for (Action x : enjoymentList)
            System.out.print(x + ", ");
        System.out.println("\n");
    }
}