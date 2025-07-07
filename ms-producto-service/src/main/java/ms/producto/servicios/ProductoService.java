package ms.producto.servicios;

import ms.producto.modelo.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> findAll();
    Producto create(Producto producto);
    Producto update(Long id, Producto producto);
    void delete(Long id);
    Producto updateStock(Long id, Integer stock);
}
