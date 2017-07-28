package utils;


import hero.Action;
import hero.Hero;

/**
 * Created by Maksym on 23.02.2017.
 */
public class Printer {

    public void printStats(Hero hero, Action action) {
        System.out.println("\nYour stats are next:");
        System.out.println("XP: " + hero.getXp() + "          |  (" + (action.getXp() != 0 ? (action.getXp() > 0 ? "+" + action.getXp() : action.getXp()): "") + ")");
        System.out.println("Level: " + hero.getLevel().getLvl());
        System.out.println("Hunger: " + hero.getHunger() + "     |  (" + (action.getHunger() != 0 ? (action.getHunger() > 0 ? "+" + action.getHunger() : action.getHunger()) : "") + ")");
        System.out.println("Rest: " + hero.getRest() + "       |  (" + (action.getRest() != 0 ? (action.getRest() > 0 ? "+" + action.getRest() : action.getRest()) : "") + ")");
        System.out.println("Excitement: " + hero.getExcitement() + " |  (" + (action.getExcitement() != 0 ? (action.getExcitement() > 0 ? "+" + action.getExcitement() : action.getExcitement()) : "") + ")");
        System.out.println("Money: $" + hero.getMoney() + "     |  (" + (action.getMoney() != 0 ? (action.getMoney() > 0 ? "+" + action.getMoney() : action.getMoney()) : "") + ")\n");
    }

    public void printAppeal(Hero hero, Action action) {
        System.out.println("\nAppeal: " + hero.getAppeal() + "   |  (+" + (action.getAppeal() != 0 ? action.getAppeal() : "") + ")\n");
    }

    public void printFitness(Hero hero, Action action) {
        System.out.println("\nFitness: " + hero.getFitness() + "   |  (" + (action.getFitness() != 0 ? (action.getFitness() > 0 ? "+" + action.getFitness() : action.getFitness()) : "") + ")\n");
    }

    public void printStudyingProcess(Hero hero, Action action) {
        System.out.println("\nStudying process: " + hero.getStudyingProcess() * 100 + "%   |  (+" + (action.getStudyingProcess() != 0 ? action.getStudyingProcess() * 100 + "%" : "") + ")\n");
    }
}
