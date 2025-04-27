package pe.edu.tecsup.springbootapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Categoria {

    private Long id;
    private String nombre;
    private Integer orden;

}
