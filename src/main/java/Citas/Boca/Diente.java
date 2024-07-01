package Citas.Boca;

import java.util.List;

public class Diente {
    private Integer posicion = null;
    private Integer cuspides = null;
    private Integer raices = null;
    private Esmalte esmalte = null;
    private List<Caries> caries = null;
    private String rotura = null;
    private NervioState nervio = null;
    private DienteType tipo_de_diente = null;

    public Diente() {
    }

    public Diente(Integer posicion, Integer cuspides, Integer raices, Esmalte esmalte, List<Caries> caries, String rotura, NervioState nervio, DienteType tipo_de_diente) {
        this.posicion = posicion;
        this.cuspides = cuspides;
        this.raices = raices;
        this.esmalte = esmalte;
        this.caries = caries;
        this.rotura = rotura;
        this.nervio = nervio;
        this.tipo_de_diente = tipo_de_diente;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getCuspides() {
        return cuspides;
    }

    public void setCuspides(Integer cuspides) {
        this.cuspides = cuspides;
    }

    public Integer getRaices() {
        return raices;
    }

    public void setRaices(Integer raices) {
        this.raices = raices;
    }

    public Esmalte getEsmalte() {
        return esmalte;
    }

    public void setEsmalte(Esmalte esmalte) {
        this.esmalte = esmalte;
    }

    public List<Caries> getCaries() {
        return caries;
    }

    public void setCaries(List<Caries> caries) {
        this.caries = caries;
    }

    public String getRotura() {
        return rotura;
    }

    public void setRotura(String rotura) {
        this.rotura = rotura;
    }

    public NervioState getNervio() {
        return nervio;
    }

    public void setNervio(NervioState nervio) {
        this.nervio = nervio;
    }

    public DienteType getTipo_de_diente() {
        return tipo_de_diente;
    }

    public void setTipo_de_diente(DienteType tipo_de_diente) {
        this.tipo_de_diente = tipo_de_diente;
    }

    @Override
    public String toString() {
        return "Diente{" +
                "posicion=" + getPosicion() +
                ", cuspides=" + getCuspides() +
                ", raices=" + getRaices() +
                ", esmalte=" + getEsmalte() +
                ", caries=" + getCaries() +
                ", rotura='" + getRotura() + '\'' +
                ", nervio=" + getNervio() +
                ", tipo_de_diente=" + getTipo_de_diente() +
                '}';
    }
}
