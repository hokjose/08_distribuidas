package ms.venta.repositorio;

import ms.venta.modelo.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRep extends JpaRepository<DetalleVenta, Long> {
}
