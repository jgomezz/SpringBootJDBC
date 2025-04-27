package pe.edu.tecsup.springbootapp.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.springbootapp.entities.Categoria;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoriaRepositoryImpl implements CategoriaRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Categoria> findAll() throws Exception {

        List<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria(1L, "Computadoras", 1));

        return categorias;
    }

}
