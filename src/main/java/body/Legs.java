package body;

public class Legs extends Body {
    private String name = "Run, Forrest, run!.";

    public Legs() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Legs";
    }
}