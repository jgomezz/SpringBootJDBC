package pe.edu.tecsup.springbootapp.mapper;

import org.springframework.stereotype.Component;
import pe.edu.tecsup.springbootapp.dto.ProductoDTO;
import pe.edu.tecsup.springbootapp.entities.Producto;

@Component
public class ProductoMapper {

    public ProductoDTO mapToDTO(Producto producto) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setId(producto.getId());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setDescripcion(producto.getDescripcion());
        productoDTO.setPrecio(producto.getPrecio());
        productoDTO.setStock(producto.getStock());
        productoDTO.setImagen_nombre(producto.getImagen_nombre());
        /*
        if (producto.getCategoria() != null )
            productoDTO.setCategoriaDTO(this.categoriaMapper.mapToDTO(producto.getCategoria()));
        else
            productoDTO.setCategoriaDTO(null);
        */
        return productoDTO;

    }

    public Producto mapToEntity(ProductoDTO dto) {
        return null;
    }

}
