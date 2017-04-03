package Hero;

/**
 * Created by Maksym on 17.02.2017.
 */
public class Level {
    int lvl = 1;

    public int xpEarn (int xp){
        int temp = Hero.xp;
        Hero.xp += xp;
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
        lvl ++;
        System.out.println("Congrats on new level!");
        return lvl;
    }
}
