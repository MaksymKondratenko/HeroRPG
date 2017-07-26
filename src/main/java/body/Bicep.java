package body;

public class Bicep extends Body {
    private String name = "Nice pillow for your head.";

    public Bicep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Bicep";
    }
}
