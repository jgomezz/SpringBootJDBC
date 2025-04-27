package pe.edu.tecsup.springbootapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.tecsup.springbootapp.dto.CategoriaDTO;
import pe.edu.tecsup.springbootapp.mapper.CategoriaMapper;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;

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
        return this.categoriaRepository.findAll()
                .stream()
                .map(categoriaMapper::mapToDTO)
                .collect(Collectors.toList());
    }
}
