package food;

public class Pizza extends Food {
    private String info = "Taste the Italy!";
    private int m = -3;
    private int x = 2;
    private int h = 50;
    private int ex = 3;
    private float f = -0.02f;

    public Pizza() {
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
        return "Pizza";
    }
}