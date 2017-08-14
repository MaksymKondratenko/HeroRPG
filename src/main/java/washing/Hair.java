package washing;

import org.springframework.beans.factory.annotation.Value;

public class Hair extends Washing {
    private String id = "Grass hair";
    private String info = "Stylish look!";
    @Value("#{time.addTime(15)}")
    private int time;
    @Value("1")
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
        return "Hair";
    }
}