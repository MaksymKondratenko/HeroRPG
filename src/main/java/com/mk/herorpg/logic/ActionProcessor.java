package com.mk.herorpg.logic;

import com.mk.herorpg.hero.Action;
import com.mk.herorpg.hero.Hero;

public class ActionProcessor {
    public void process(Action action, Hero hero) {
        if (action.getXp() != 0)
            hero.setXp(hero.getXp() + action.getXp());
        if (action.getHunger() != 0)
            hero.setHunger(hero.getHunger() + action.getHunger());
        if (action.getRest() != 0)
            hero.setRest(hero.getRest() + action.getRest());
        if (action.getExcitement() != 0)
            hero.setExcitement(hero.getExcitement() + action.getExcitement());
        if (action.getAppeal() != 0)
            hero.setAppeal(hero.getAppeal() + action.getAppeal());
        if (action.getMoney() != 0)
            hero.setMoney(hero.getMoney() + action.getMoney());
        if (action.getStudyingProcess() != 0)
            hero.setStudyingProcess(hero.getStudyingProcess() + action.getStudyingProcess());
        if (action.getFitness() != 0)
            hero.setFitness(hero.getFitness() + action.getFitness());
    }
}