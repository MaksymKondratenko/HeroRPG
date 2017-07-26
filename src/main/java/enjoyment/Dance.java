package enjoyment;


public class Dance extends Enjoyment{
    private String info = "I'd like to move it, move it...";
    private int m = 0;
    private int x = 1;
    private int h = -10;
    private int r = 5;
    private int ex = 30;
    public String toString() {
        return "Dance";
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
}