package pe.edu.tecsup.springbootapp.repositories;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import java.util.List;
import java.util.Optional;

public interface CategoriaRepository {

    List<Categoria> findAll() throws Exception;

    Optional<Categoria> findById(Long id) throws Exception;

}
