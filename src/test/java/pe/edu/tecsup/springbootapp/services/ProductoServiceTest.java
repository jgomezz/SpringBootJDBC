package pe.edu.tecsup.springbootapp.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.tecsup.springbootapp.dto.ProductoDTO;
import pe.edu.tecsup.springbootapp.entities.Producto;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
class ProductoServiceTest {

    @Autowired
    ProductoService productoService;

    @Test
    void findAll() throws Exception {

        Boolean VALUE_EXPECTED = true;

        List<ProductoDTO> productos = this.productoService.findAll();

        productos.forEach(prod -> log.info(prod.getNombre()));
        //log.info(categorias.toString());

        assertEquals(VALUE_EXPECTED, !productos.isEmpty());

    }

    @Test
    void findById() throws Exception {

        String NAME_EXPECTED = "Kingstone";

        Optional<ProductoDTO> productoOptional
                = this.productoService.findById(1L);

        if (productoOptional.isPresent()) {
            ProductoDTO productoDTO = productoOptional.get();
            log.info(productoDTO.toString());
            assertEquals(NAME_EXPECTED, productoDTO.getNombre());
        } else {
            throw new Exception("Producto no encontrado");
        }

    }
}