package Citas.Persona;

public class Dentista {
    private String nombre = null;
    private Double sueldo = null;
    private String correo = null;
    private Phonenumber phonenumber = null;

    public Dentista() {}

    public Dentista(String nombre, Double sueldo, String correo, Phonenumber phonenumber) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.correo = correo;
        this.phonenumber = phonenumber;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Phonenumber getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Phonenumber phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "nombre='" + getNombre() + '\'' +
                ", sueldo=" + getSueldo() +
                ", correo='" + getCorreo() + '\'' +
                ", phonenumber=" + getPhonenumber() +
                '}';
    }
}
