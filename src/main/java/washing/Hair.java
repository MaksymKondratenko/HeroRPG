package washing;

public class Hair extends Washing {
    private String id = "Grass hair";
    private String info = "Stylish look!";
    private int x = 1;

    public Hair() {
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
        return "Hair";
    }
}