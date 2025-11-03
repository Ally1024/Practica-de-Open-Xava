package ni.edu.uam.facturacion.modelo;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Producto {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(length=9)
int numero;

    @Column(length=50) @Required
    String descripcion;
}
