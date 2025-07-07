package ms.producto.repositorio;

import ms.producto.modelo.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRep extends JpaRepository<Genero, Long> {
}
