package ms.venta.repositorio;

import ms.venta.modelo.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRep extends JpaRepository<Venta, Long> {
}
