package utils;

import hero.Action;

/**
 * Created by Maksym on 20.02.2017.
 */
public class Time extends Action {

    private int d = 0;
    private int h = 0;
    private int m = 0;

    public void setD(int d) {
        this.d = d;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

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
}
