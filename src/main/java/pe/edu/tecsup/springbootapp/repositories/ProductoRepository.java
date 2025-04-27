package pe.edu.tecsup.springbootapp.repositories;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;

import java.util.List;

public interface ProductoRepository {

     List<Producto> findAll() throws Exception;

}
