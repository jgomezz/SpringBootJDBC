package pe.edu.tecsup.springbootapp.services;

import lombok.extern.slf4j.Slf4j;
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

@Slf4j
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    ProductoMapper productoMapper;


    @Override
    public List<ProductoDTO> findAll() throws Exception {
        log.info("call findAll()");

        return this.productoRepository.findAll()
                .stream()
                .map(this.productoMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductoDTO> findByNombre(String nombre) throws Exception {
        log.info("call findByNombre()");

        return this.productoRepository.findByNombre(nombre)
                .stream()
                .map(this.productoMapper::mapToDTO)
                .collect(Collectors.toList());    }


    @Override
    public Optional<ProductoDTO> findById(Long id) throws Exception {
        log.info("call findById()");

        return this.productoRepository.findById(id)
                .map(this.productoMapper::mapToDTO);
    }

    @Override
    public void save(ProductoDTO productoDTO) throws Exception {
        log.info("call save()");
        this.productoRepository.save(this.productoMapper.mapToEntity(productoDTO));
    }

    @Override
    public void deleteById(Long id) throws Exception {
        log.info("call deleteById()");
        this.productoRepository.deleteById(id);
    }

    @Override
    public void update(Long id, String nombreProducto) throws Exception {
        log.info("call update()");
        this.productoRepository.update(id, nombreProducto);
    }
}
