package pe.edu.tecsup.springbootapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.tecsup.springbootapp.dto.CategoriaDTO;
import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.mapper.CategoriaMapper;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    CategoriaMapper categoriaMapper;

    @Transactional(readOnly = true)
    @Override
    public List<CategoriaDTO> findAll() throws Exception {

        /*
        List<CategoriaDTO> categoriasDTO = new ArrayList<>();

        List<Categoria> categorias = this.categoriaRepository.findAll();

        for(Categoria entity : categorias) {
            CategoriaDTO dto = categoriaMapper.mapToDTO(entity);
            categoriasDTO.add(dto);

        }

        return categoriasDTO;

        */

        List<CategoriaDTO> categoriasDTO =  this.categoriaRepository.findAll()
                                                .stream()
                                                .map(this.categoriaMapper::mapToDTO)
                                                .collect(Collectors.toList());


        return categoriasDTO;
    }
}
