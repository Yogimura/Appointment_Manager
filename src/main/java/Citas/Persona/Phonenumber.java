package Citas.Persona;

public class Phonenumber {
    private String proposito = null;
    private String Codigo_pais = null;
    private String numero = null;

    public Phonenumber() {
    }

    public Phonenumber(String proposito, String codigo_pais, String numero) {
        this.proposito = proposito;
        Codigo_pais = codigo_pais;
        this.numero = numero;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getCodigo_pais() {
        return Codigo_pais;
    }

    public void setCodigo_pais(String codigo_pais) {
        Codigo_pais = codigo_pais;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Phonenumber{" +
                "proposito='" + getProposito() + '\'' +
                ", Codigo_pais='" + getCodigo_pais() + '\'' +
                ", numero='" + getNumero() + '\'' +
                '}';
    }
}
