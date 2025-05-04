package pe.edu.tecsup.springbootapp.services;

import pe.edu.tecsup.springbootapp.dto.CategoriaDTO;
import pe.edu.tecsup.springbootapp.dto.ProductoDTO;
import pe.edu.tecsup.springbootapp.entities.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    List<CategoriaDTO> findAll() throws Exception;

    Optional<CategoriaDTO> findById(Long id) throws Exception;

}
