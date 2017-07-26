package food;

public class Burger extends Food {
    private String info = "The fastest way to get TTT!";
    private int m = -1;
    private int x = 1;
    private int h = 30;
    private int ex = 1;
    private float f = -0.05f;

    public Burger() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getEx() {
        return ex;
    }

    public void setEx(int ex) {
        this.ex = ex;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public String toString() {
        return "Burger";
    }
}