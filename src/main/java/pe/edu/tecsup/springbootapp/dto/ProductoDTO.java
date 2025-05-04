package pe.edu.tecsup.springbootapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import pe.edu.tecsup.springbootapp.entities.Categoria;

import java.time.LocalDateTime;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoDTO {

    private Long id;
    private Long categoria_id;
    private Categoria categoria;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;
    private String imagen_nombre;
    private String imagen_tipo;
    private Long imagen_tamanio;
    private Integer estado;
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime creado;

}
