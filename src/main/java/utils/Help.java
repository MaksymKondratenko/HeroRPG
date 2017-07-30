package utils;

import hero.Action;

public class Help extends Action {
    private String info = "Type: read - to read a books\n      sleep - to sleep\n      eat - to eat food\n      " +
            "work - to do some job and earn money\n      enjoy - to spend some time with relax\n      " +
            "train - to go to gym\n      study - to gain some knowledge\n      wash - to clean the hero\n      " +
            "date - to go to date\n      time - to show the game time\n      end - to exit";

    public Help() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void showInfo() {
        System.out.println(info);
    }
}
