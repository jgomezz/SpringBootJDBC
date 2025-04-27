package pe.edu.tecsup.springbootapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;
import pe.edu.tecsup.springbootapp.repositories.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() throws Exception {
        return this.productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) throws Exception {
        return this.productoRepository.findById(id);
    }
}
