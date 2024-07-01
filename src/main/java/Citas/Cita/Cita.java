package Citas.Cita;

import Citas.Cita.Tipos_de_cita.Diagnostico;
import Citas.Persona.Dentista;
import Citas.Persona.Paciente;

import java.util.Date;

public abstract class Cita {
    protected Date fecha;
    protected Paciente paciente;
    protected Double precio;
    protected Dentista dentista;
    protected Diagnostico diagnostico;

    public Cita() {
    }

    public Cita(Date fecha, Paciente paciente, Double precio, Dentista dentista, Diagnostico diagnostico) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.precio = precio;
        this.dentista = dentista;
        this.diagnostico = diagnostico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + getFecha() +
                ", paciente=" + getPaciente() +
                ", precio=" + getPrecio() +
                ", dentista=" + getDentista() +
                ", diagnostico=" + getDiagnostico() +
                '}';
    }
}
