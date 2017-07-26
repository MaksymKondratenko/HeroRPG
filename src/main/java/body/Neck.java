package body;

public class Neck extends Body {
    private String name = "Vital for keeping your head straight.";

    public Neck() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Neck";
    }
}