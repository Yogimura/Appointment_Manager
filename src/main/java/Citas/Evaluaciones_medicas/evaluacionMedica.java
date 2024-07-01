package Citas.Evaluaciones_medicas;

import Citas.Persona.Paciente;

public class evaluacionMedica {
    Paciente paciente = null;

    public evaluacionMedica() {
    }

    public evaluacionMedica(Paciente paciente) {
        this.paciente = paciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "evaluacionMedica{" +
                "paciente=" + getPaciente() +
                '}';
    }
}
