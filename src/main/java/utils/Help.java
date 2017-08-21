package utils;

import hero.Action;
import lombok.Getter;
import lombok.Setter;

public class Help extends Action {
    @Getter @Setter
    private String info = "Type: read - to read a books\n      sleep - to sleep\n      eat - to eat food\n      " +
            "work - to do some job and earn money\n      enjoy - to spend some time with relax\n      " +
            "train - to go to gym\n      study - to gain some knowledge\n      wash - to clean the hero\n      " +
            "date - to go to date\n      actions - to retrieve from database the list of conducted actions\n      " +
            "time - to show the game time\n      end - to exit";

    public void showInfo() {
        System.out.println(info);
    }

    @Override
    public String toString(){
        return "Asking for help";
    }
}
