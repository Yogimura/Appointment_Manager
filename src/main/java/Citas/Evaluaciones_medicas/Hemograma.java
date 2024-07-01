package Citas.Evaluaciones_medicas;

import Citas.Persona.Paciente;

public class Hemograma extends evaluacionMedica{
    private Float hemoglobina = null;
    private Float plaquetas = null;
    private Float Globulo_Blanco = null;
    private Float Azucar = null;

    public Hemograma() {
    }

    public Hemograma(Float hemoglobina, Float plaquetas, Float globulo_Blanco, Float azucar) {
        this.hemoglobina = hemoglobina;
        this.plaquetas = plaquetas;
        this.Globulo_Blanco = globulo_Blanco;
        this.Azucar = azucar;
    }

    public Hemograma(Paciente paciente, Float hemoglobina, Float plaquetas, Float globulo_Blanco, Float azucar) {
        super(paciente);
        this.hemoglobina = hemoglobina;
        this.plaquetas = plaquetas;
        Globulo_Blanco = globulo_Blanco;
        Azucar = azucar;
    }

    public Float getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(Float hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public Float getPlaquetas() {
        return plaquetas;
    }

    public void setPlaquetas(Float plaquetas) {
        this.plaquetas = plaquetas;
    }

    public Float getGlobulo_Blanco() {
        return Globulo_Blanco;
    }

    public void setGlobulo_Blanco(Float globulo_Blanco) {
        this.Globulo_Blanco = globulo_Blanco;
    }

    public Float getAzucar() {
        return Azucar;
    }

    public void setAzucar(Float azucar) {
        this.Azucar = azucar;
    }

    @Override
    public String toString() {
        return "Hemograma{" +
                "hemoglobina=" + getHemoglobina() +
                ", plaquetas=" + getPlaquetas() +
                ", Globulo_Blanco=" + getGlobulo_Blanco() +
                ", Azucar=" + getAzucar() +
                '}';
    }
}
