package Citas.Persona;

public class Paciente {
    private String nombre = null;
    private Sexo sexo = null;
    private Integer peso = null;
    private Integer Estatura = null;
    private String correo = null;
    private Integer edad = null;
    private Etnia etnia = null;
    private Phonenumber phonenumber = null;
    private Direccion direccion = null;

    public Paciente() {
    }

    public Paciente(String nombre, Sexo sexo, Integer peso, Integer estatura, String correo, Integer edad, Etnia etnia, Phonenumber phonenumber, Direccion direccion) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.Estatura = estatura;
        this.correo = correo;
        this.edad = edad;
        this.etnia = etnia;
        this.phonenumber = phonenumber;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getEstatura() {
        return Estatura;
    }

    public void setEstatura(Integer estatura) {
        Estatura = estatura;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Etnia getEtnia() {
        return etnia;
    }

    public void setEtnia(Etnia etnia) {
        this.etnia = etnia;
    }

    public Phonenumber getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Phonenumber phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + getNombre() + '\'' +
                ", sexo=" + getSexo() +
                ", peso=" + getPeso() +
                ", Estatura=" + getEstatura() +
                ", correo='" + getCorreo() + '\'' +
                ", edad=" + getEdad() +
                ", etnia=" + getEtnia() +
                ", phonenumber=" + getPhonenumber() +
                ", direccion=" + getDireccion() +
                ", estatura=" + getEstatura() +
                '}';
    }
}
