package Citas.Boca;

import java.util.List;

public class Encias {
    private List<Color> colores = null;
    private String consistencia = null;

    public Encias() {
    }

    public Encias(List<Color> colores, String consistencia) {
        this.colores = colores;
        this.consistencia = consistencia;
    }

    public List<Color> getColores() {
        return colores;
    }

    public void setColores(List<Color> colores) {
        this.colores = colores;
    }

    public String getConsistencia() {
        return consistencia;
    }

    public void setConsistencia(String consistencia) {
        this.consistencia = consistencia;
    }

    @Override
    public String toString() {
        return "Encias{" +
                "colores=" + getColores() +
                ", consistencia='" + getConsistencia() + '\'' +
                '}';
    }
}
