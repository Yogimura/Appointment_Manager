package Citas.Cita.Tipos_de_cita;

import Citas.Boca.Encias;
import Citas.Cita.Cita;
import Citas.Evaluaciones_medicas.evaluacionMedica;
import Citas.Persona.Dentista;
import Citas.Persona.Paciente;

import java.util.Date;
import java.util.List;

public class Diagnostico extends Cita {
    private List<evaluacionMedica> evaluacionMedica = null;
    private Encias encias = null;

    public Diagnostico() {
    }

    public Diagnostico(List<evaluacionMedica> evaluacionMedica, Encias encias) {
        this.evaluacionMedica = evaluacionMedica;
        this.encias = encias;
    }

    public Diagnostico(Date fecha, Paciente paciente, Double precio, Dentista dentista, Diagnostico diagnostico, List<evaluacionMedica> evaluacionMedica, Encias encias) {
        super(fecha, paciente, precio, dentista, diagnostico);
        this.evaluacionMedica = evaluacionMedica;
        this.encias = encias;
    }

    public List<evaluacionMedica> getEvaluacionMedica() {
        return evaluacionMedica;
    }

    public void setEvaluacionMedica(List<evaluacionMedica> evaluacionMedica) {
        this.evaluacionMedica = evaluacionMedica;
    }

    public Encias getEncias() {
        return encias;
    }

    public void setEncias(Encias encias) {
        this.encias = encias;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "evaluacionMedica=" + getEvaluacionMedica() +
                ", encias=" + getEncias() +
                "} " + super.toString();
    }
}
