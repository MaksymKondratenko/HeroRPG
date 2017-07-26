package utils;

import hero.Action;

public class Help implements Action {
    private String info = "Type: read - to read a books\n      sleep - to sleep ---X\n      eat - to eat food\n      " +
            "work - to do some job and earn money ---X\n      enjoy - to spend some time with relax\n      " +
            "train - to go to gym\n      study - to gain some knowledge ---X\n      wash - to clean the hero\n      " +
            "date - to go to date ---X\n      show time - to show the game time ---X\n      end - to exit ---X";

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
