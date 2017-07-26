package washing;

public class Shower extends Washing {
    private String id = "Take a shower";
    private String info = "Fast food in bathing.";
    private int x = 2;

    public Shower() {
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
        return "Shower";
    }
}