package pe.edu.tecsup.springbootapp.repositories;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {

     List<Producto> findAll() throws Exception;

     Optional<Producto> findById(Long id) throws Exception;

}
