package pe.edu.tecsup.springbootapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.springbootapp.dto.ProductoDTO;
import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;
import pe.edu.tecsup.springbootapp.mapper.ProductoMapper;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;
import pe.edu.tecsup.springbootapp.repositories.ProductoRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    ProductoMapper productoMapper;


    @Override
    public List<ProductoDTO> findAll() throws Exception {
        return this.productoRepository.findAll()
                .stream()
                .map(this.productoMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductoDTO> findById(Long id) throws Exception {
        return this.productoRepository.findById(id)
                .map(this.productoMapper::mapToDTO);
    }
}
