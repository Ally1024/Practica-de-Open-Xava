package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.NoFrame;
import org.openxava.annotations.View;

import javax.persistence.*;

@Entity
@Getter
@Setter
@View(name="Simple", members="id, nombre")

public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Nombre del cliente", length=50,nullable=false)
    private String nombre;

    @Embedded @NoFrame // Con @NoFrame no se muestra marco para direccion
    private Direccion direccion;

}
