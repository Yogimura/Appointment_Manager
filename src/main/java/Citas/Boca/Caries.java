package Citas.Boca;

public class Caries {
    private String posicion = null;
    private ClaseCaries clase = null;

    public Caries() {
    }

    public Caries(String posicion, ClaseCaries clase) {
        this.posicion = posicion;
        this.clase = clase;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public ClaseCaries getClase() {
        return clase;
    }

    public void setClase(ClaseCaries clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Caries{" +
                "posicion='" + getPosicion() + '\'' +
                ", clase=" + getClase() +
                '}';
    }
}
