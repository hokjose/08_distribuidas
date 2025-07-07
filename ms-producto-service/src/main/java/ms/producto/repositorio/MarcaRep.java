package ms.producto.repositorio;

import ms.producto.modelo.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRep extends JpaRepository<Marca, Long> {
}
