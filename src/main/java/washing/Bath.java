package washing;

import org.springframework.beans.factory.annotation.Value;

public class Bath extends Washing {
    private String id = "Take a bath";
    private String info = "Better to use a salt bomb.";
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("3")
    private int appeal;

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

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int getAppeal() {
        return appeal;
    }

    @Override
    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    @Override
    public String toString() {
        return "Bath";
    }
}