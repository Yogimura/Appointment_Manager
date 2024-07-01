package Citas.Boca;

public class Esmalte {
    private String color = null;
    private String dureza = null;

    public Esmalte() {
    }

    public Esmalte(String color, String dureza) {
        this.color = color;
        this.dureza = dureza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    @Override
    public String toString() {
        return "Esmalte{" +
                "color='" + getColor() + '\'' +
                ", dureza='" + getDureza() + '\'' +
                '}';
    }
}
