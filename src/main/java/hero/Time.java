package hero;

/**
 * Created by Maksym on 20.02.2017.
 */
public class Time {

    int d = 0;
    int h = 0;
    int m = 0;
    int date = 0;

    public int addTime(int mins){
        date += mins;
        return date;
    }

    public int getM(){
        m = date%60;
        return m;
    }

    public int getH(){
        h = ((date - date%60)/60)%24;
        return h;
    }

    public int getD(){
        d = /*(date - date%60)/60 - */(date - date%60)/(60*24);// - date%(60*24) - date%(60);
        return d;
    }


    public void showTime(){
        m = getM();
        h = getH();
        d = getD();
        System.out.println("Time elapsed: " + d + " days, " + h + " hours, " + m + " minutes.");
    }
}
