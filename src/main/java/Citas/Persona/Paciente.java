package Citas.Persona;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@NoArgsConstructor @Getter @Setter @ToString
public class Paciente {
    @Id
    @Column(name = "paciente_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = 0;
    private String nombre = null;
    private static Sexo sexo = null;
    private Integer peso = null;
    private Integer Estatura = null;
    private String correo = null;
    private Integer edad = null;
    private static Etnia etnia= null;
    private static Phonenumber phonenumber = null;
    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion = null;


    public Paciente(String nombre, Sexo sexo, Integer peso, Integer estatura, String correo, Integer edad, Etnia etnia, Phonenumber phonenumber) {
        this.nombre = nombre;
        //this.sexo = sexo;
        this.peso = peso;
        this.Estatura = estatura;
        this.correo = correo;
        this.edad = edad;
        //this.etnia = etnia;
        //this.phonenumber = phonenumber;
    }

}
