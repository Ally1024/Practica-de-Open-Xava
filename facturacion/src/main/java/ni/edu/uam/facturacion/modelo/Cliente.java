package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Nombre del cliente", length=50,nullable=false)
    private String nombre;

}
