package hero;

/**
 * Created by Maksym on 14.02.2017.
 */
public class Hero {
    private static Hero singleHero;
    private String name = "Sir Lancelot";
    private int xp = 0;
    private int hunger = 100;
    private int rest = 100;
    private int excitement = 100;
    private int appeal = 0;
    private int money = 10;
    private float studyingProcess = 0.0f;
    private float fitness = 0.0f;
    private Level level = new Level();

    public Hero () {}
    public Hero(String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public int getExcitement() {
        return excitement;
    }

    public void setExcitement(int excitement) {
        this.excitement = excitement;
    }

    public int getAppeal() {
        return appeal;
    }

    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public float getStudyingProcess() {
        return studyingProcess;
    }

    public void setStudyingProcess(float studyingProcess) {
        this.studyingProcess = studyingProcess;
    }

    public float getFitness() {
        return fitness;
    }

    public void setFitness(float fitness) {
        this.fitness = fitness;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    /*

        public static void date() throws IOException {
        time.addTime(120);

        System.out.println("You are going to hunt a new chick. Who'd be next?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Girl girl = new Girl(br.readLine());
        if (girl.lucky.nextInt(2) == 1)
            System.out.println("You've found a couple! Her name is "+ girl.name);
        else
            System.out.println("Not your time, bro.");
    }*/
}
