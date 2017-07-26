package hero;

/**
 * Created by Maksym on 17.02.2017.
 */
public class Level {
    int lvl = 1;

    public Level() {
    }

    /*public int xpEarn (int xp){
        int temp = Hero.xp;
        Hero.xp += xp;
        Delta.xp = "(+" + xp + ")";
        int a = Hero.xp;

        if (temp <10 && (a >= 10 && a < 25))
            levelUp();
        else if ((temp >= 10 && temp < 25) && (a >= 25 && a < 50))
            levelUp();
        else if ((temp >= 25 && temp < 50) && (a >= 50 && a < 100))
            levelUp();
        else if ((temp >= 50 && temp < 100) && (a >= 100 && a < 200))
            levelUp();

        return lvl;
    }

    public int levelUp (){
        lvl++;
        Delta.level = "(+1)";
        System.out.println("Congrats on new level!");
        return lvl;
    }*/

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
