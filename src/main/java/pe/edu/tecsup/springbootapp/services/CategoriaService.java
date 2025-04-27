package pe.edu.tecsup.springbootapp.services;

import pe.edu.tecsup.springbootapp.dto.CategoriaDTO;
import pe.edu.tecsup.springbootapp.entities.Categoria;

import java.util.List;

public interface CategoriaService {

    List<CategoriaDTO> findAll() throws Exception;

}
