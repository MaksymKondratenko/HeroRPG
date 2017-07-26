package washing;

public class Nails extends Washing {
    private String id = "Cut nails";
    private String info = "Time to cut your cat nails!";
    private int x = 1;

    public Nails() {
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
        return "Nails";
    }
}