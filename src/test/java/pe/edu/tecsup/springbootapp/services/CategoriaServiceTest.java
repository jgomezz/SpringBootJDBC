package pe.edu.tecsup.springbootapp.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.tecsup.springbootapp.dto.CategoriaDTO;
import pe.edu.tecsup.springbootapp.entities.Categoria;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class CategoriaServiceTest {

    @Autowired
    CategoriaService categoriaService;

    @Test
    void findAll() throws Exception {

        Boolean VALUE_EXPECTED = true;

        List<CategoriaDTO> categorias = this.categoriaService.findAll();

        categorias.stream().forEach(cat -> log.info(cat.getNombre()));

        assertEquals(VALUE_EXPECTED, !categorias.isEmpty());

    }
}