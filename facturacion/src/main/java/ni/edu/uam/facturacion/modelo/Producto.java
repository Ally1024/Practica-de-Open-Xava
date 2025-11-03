package ni.edu.uam.facturacion.modelo;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Files;
import org.openxava.annotations.Money;
import org.openxava.annotations.TextArea;

import javax.persistence.*;
import java.math.BigDecimal;

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

    @ManyToOne( // La referencia se almacena como una relación en la base de datos
            fetch=FetchType.LAZY, // La referencia se carga bajo demanda
            optional=true) // La referencia puede estar sin valor
    @DescriptionsList // Así la referencia se visualiza usando un combo
    Categoria categoria; // Una referencia Java convencional

    @Money // La propiedad precio se usa para almacenar dinero
    BigDecimal precio; // BigDecimal se suele usar para dinero

    @Files // Una galería de fotos completa está disponible
    @Column(length=32) // La cadena de 32 de longitud es para almacenar la clave de la galería
    String fotos;

    @TextArea // Esto es para un texto grande, se usará un área de texto o equivalente
    String observaciones;
}
