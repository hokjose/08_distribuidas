package ms.cliente.repositorio;

import ms.cliente.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRep extends JpaRepository<Cliente, Long> {
}
