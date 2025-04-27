package pe.edu.tecsup.springbootapp.services;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> findAll() throws Exception;

}
