package books;

public class Psychology extends Book {
    private String info = "Understand her or become crazy.";
    private int xp = 2;
    private int h = -2;
    private int r = -3;
    private int ex = -2;

    public Psychology() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
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
        return "Psychology";
    }
}