package Citas.Evaluaciones_medicas;

import Citas.Boca.Diente;
import Citas.Persona.Paciente;

import java.util.List;

public class Panoramica extends evaluacionMedica{
    List<Diente> piezasFaltantes = null;
    List<Diente> piezasEnPeligro = null;

    public Panoramica() {
    }

    public Panoramica(List<Diente> piezasFaltantes, List<Diente> piezasEnPeligro) {
        this.piezasFaltantes = piezasFaltantes;
        this.piezasEnPeligro = piezasEnPeligro;
    }

    public Panoramica(Paciente paciente, List<Diente> piezasFaltantes, List<Diente> piezasEnPeligro) {
        super(paciente);
        this.piezasFaltantes = piezasFaltantes;
        this.piezasEnPeligro = piezasEnPeligro;
    }

    public List<Diente> getPiezasFaltantes() {
        return piezasFaltantes;
    }

    public void setPiezasFaltantes(List<Diente> piezasFaltantes) {
        this.piezasFaltantes = piezasFaltantes;
    }

    public List<Diente> getPiezasEnPeligro() {
        return piezasEnPeligro;
    }

    public void setPiezasEnPeligro(List<Diente> piezasEnPeligro) {
        this.piezasEnPeligro = piezasEnPeligro;
    }

    @Override
    public String toString() {
        return "Panoramica{" +
                "piezasFaltantes=" + getPiezasFaltantes() +
                ", piezasEnPeligro=" + getPiezasEnPeligro() +
                '}';
    }
}
