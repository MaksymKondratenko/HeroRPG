package washing;

public class Teeth extends Washing {
    private String id = "Wash teeth";
    private String info = "Goal is to have a Hollywood smile.";
    private int x = 1;

    public Teeth() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String toString() {
        return "Teeth";
    }
}