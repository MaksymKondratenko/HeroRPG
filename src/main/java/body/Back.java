package body;

public class Back extends Body {
    private String name = "Have a wall behind.";

    public Back() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Back";
    }
}