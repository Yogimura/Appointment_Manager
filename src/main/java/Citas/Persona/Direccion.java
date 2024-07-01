package Citas.Persona;

public class Direccion {
    private int id = 0;
    private String pais = null;
    private String ciudad = null;
    private String municipio = null;
    private String calle = null;

    public Direccion() {
    }

    public Direccion(int id, String pais, String ciudad, String municipio, String calle) {
        this.id = id;
        this.pais = pais;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.calle = calle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "pais='" + getPais() + '\'' +
                ", ciudad='" + getCiudad() + '\'' +
                ", municipio='" + getMunicipio() + '\'' +
                ", calle='" + getCalle() + '\'' +
                '}';
    }
}
