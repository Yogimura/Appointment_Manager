package Citas.Persona;


import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor @Getter @Setter @ToString
public class Direccion {
    @Id
    @Column(name = "direccion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = 0;
    private String pais = null;
    private String ciudad = null;
    private String municipio = null;
    private String calle = null;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "direccion")
    private List<Paciente> pacientes = null;

    public Direccion(String pais, String ciudad, String municipio, String calle) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.calle = calle;
    }
}
