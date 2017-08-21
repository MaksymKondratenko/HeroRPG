package utils;

import hero.Action;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Maksym on 20.02.2017.
 */

@Setter //generates setters for all fields
public class Time extends Action {
    private int d = 0;
    private int h = 0;
    private int m = 0;
    @Getter //generates a getter also
    private int date = 0;

    public int addTime(int mins){
        date += mins;
        return date;
    }

    public int getM(){
        return date%60;
    }

    public int getH(){
        return  ((date - date%60)/60)%24;
    }

    public int getD(){
        return (date - date%60)/(60*24);
    }


    public void showTime(){

        System.out.println("Time elapsed: " + getD() + " days, " + getH() + " hours, " + getM() + " minutes.");
    }

    @Override
    public String toString(){
        return "Wondering, how much time is it";
    }
}
