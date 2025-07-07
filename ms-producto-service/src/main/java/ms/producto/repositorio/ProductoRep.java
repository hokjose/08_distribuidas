package ms.producto.repositorio;

import ms.producto.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRep extends JpaRepository<Producto, Long> {
}
