package body;

public class Press extends Body {
    private String name = "Crush all received punches for ease.";

    public Press() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Press";
    }
}