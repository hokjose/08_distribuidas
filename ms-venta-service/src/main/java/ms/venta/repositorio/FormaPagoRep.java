package ms.venta.repositorio;

import ms.venta.modelo.FormaPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagoRep extends JpaRepository<FormaPago, Long> {
}
