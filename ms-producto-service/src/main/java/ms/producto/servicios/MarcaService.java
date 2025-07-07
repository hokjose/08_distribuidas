package ms.producto.servicios;

import ms.producto.modelo.Marca;

import java.util.List;

public interface MarcaService {
    List<Marca> findAll();

    Marca create(Marca marca);

    Marca update(Long id, Marca marca);

    void delete(Long id);
}
