package books;

public class Arts extends Book {
    private String info = "Life is Art. Naturally.";
    private int xp = 1;
    private int h = -1;
    private int r = +1;
    private int ex = +3;

    public Arts() {

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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
        return "Arts";
    }
}