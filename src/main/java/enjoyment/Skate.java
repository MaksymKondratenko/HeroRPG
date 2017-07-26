package enjoyment;


public class Skate extends Enjoyment{
    private String info = "Off the wall!";
    private int m = 0;
    private int x = 2;
    private int h = -15;
    private int r = 10;
    private int ex = 25;

    public Skate() {
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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getEx() {
        return ex;
    }

    public void setEx(int ex) {
        this.ex = ex;
    }

    public String toString() {
        return "Skate";
    }
}