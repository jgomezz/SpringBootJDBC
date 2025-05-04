package pe.edu.tecsup.springbootapp.repositories;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.springbootapp.entities.Categoria;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
public class CategoriaRepositoryImpl implements CategoriaRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Categoria> findAll() throws Exception {

        log.info("Call findAll()");

        String sql = """
                    SELECT * FROM categorias
                """;

        List<Categoria> categorias = this.jdbcTemplate.query(sql, new CategoriaRowMapper());

        return categorias;
    }

    @Override
    public Optional<Categoria> findById(Long id) throws Exception {

        try {

            String sql = """
                    SELECT id, nombre, orden FROM categorias WHERE id = ?
                """;

            Categoria  categoria = this.jdbcTemplate.queryForObject(sql,
                    new CategoriaRowMapper(), id);

            return Optional.of(categoria);

        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

}

/**
 * Inner class
 */
class CategoriaRowMapper implements RowMapper<Categoria>{

    @Override
    public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setId(rs.getLong("id"));
        categoria.setNombre(rs.getString("nombre"));
        categoria.setOrden(rs.getInt("orden"));
        return categoria;
    }
}
