package com.mk.herorpg.DAO;

import com.mk.herorpg.hero.Action;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersistentAction extends Action{
    private long id;
    private String act;

    public PersistentAction(){}

    public PersistentAction(Action action) {
        act = action.toString();
    }

    @Override
    public String toString() {
        return act;
    }
}
