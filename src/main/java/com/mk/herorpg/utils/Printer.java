package com.mk.herorpg.utils;


import com.mk.herorpg.actionimpl.body.Body;
import com.mk.herorpg.actionimpl.books.Book;
import com.mk.herorpg.actionimpl.enjoyment.Enjoyment;
import com.mk.herorpg.actionimpl.food.Food;
import com.mk.herorpg.hero.Action;
import com.mk.herorpg.hero.Hero;
import com.mk.herorpg.actionimpl.washing.Washing;

/**
 * Created by Maksym on 23.02.2017.
 */
public class Printer {

    public void printLogo() {
        /*System.out.println("      / \\      ");
        System.out.println("|'''''| |'''''|");
        System.out.println("|     | |     |");
        System.out.println("|     | |     |");
        System.out.println("|     | |     |");
        System.out.println("\\  ___| |___  /");
        System.out.println(" \\ '  |||  ' /");
        System.out.println("  \\__(___)__/");
        System.out.println();*/

        System.out.println("|\\  /\\  /\\  /\\  /|");
        System.out.println("| \\/  \\/  \\/  \\/ |");
        System.out.println("|                |");
        System.out.println("|________________|");

    }

    public void printStats(Hero hero, Action action) {
        if (action.getClass() == Book.class || action.getClass() == Body.class || action.getClass() == Enjoyment.class || action.getClass() == Food.class)
            ;
        else {
            System.out.println("\nYour stats are next:");
            System.out.println("XP: " + hero.getXp() + "          |  (" + (action.getXp() != 0 ? (action.getXp() > 0 ? "+" + action.getXp() : action.getXp()) : "") + ")");
            System.out.println("Level: " + hero.getLevel().getLvl());
            System.out.println("Hunger: " + hero.getHunger() + "     |  (" + (action.getHunger() != 0 ? (action.getHunger() > 0 ? "+" + action.getHunger() : action.getHunger()) : "") + ")");
            System.out.println("Rest: " + hero.getRest() + "       |  (" + (action.getRest() != 0 ? (action.getRest() > 0 ? "+" + action.getRest() : action.getRest()) : "") + ")");
            System.out.println("Excitement: " + hero.getExcitement() + " |  (" + (action.getExcitement() != 0 ? (action.getExcitement() > 0 ? "+" + action.getExcitement() : action.getExcitement()) : "") + ")");
            System.out.println("Money: $" + hero.getMoney() + "     |  (" + (action.getMoney() != 0 ? (action.getMoney() > 0 ? "+" + action.getMoney() : action.getMoney()) : "") + ")\n");
        }
    }

    public void printAppeal(Hero hero, Action action) {
        if (action.getClass() == Washing.class)
            ;
        else
            System.out.println("\nAppeal: " + hero.getAppeal() + "   |  (+" + (action.getAppeal() != 0 ? action.getAppeal() : "") + ")\n");
    }

    public void printFitness(Hero hero, Action action) {
        if (action.getClass() == Body.class || action.getClass() == Food.class)
            ;
        else
            System.out.println("\nFitness: " + hero.getFitness() * 100 + "%   |  (" + (action.getFitness() != 0 ? (action.getFitness() > 0 ? "+" + action.getFitness() * 100 + "%" : action.getFitness() * 100 + "%") : "") + ")\n");
    }

    public void printStudyingProcess(Hero hero, Action action) {
        System.out.println("\nStudying process: " + hero.getStudyingProcess() * 100 + "%   |  (+" + (action.getStudyingProcess() != 0 ? action.getStudyingProcess() * 100 + "%" : "") + ")\n");
    }
}
