package washing;

public class Bath extends Washing {
    private String id = "Take a bath";
    private String info = "Better to use a salt bomb.";
    private int x = 3; //multiplier

    public Bath() {
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
        return "Bath";
    }
}