package ms.producto.repositorio;

import ms.producto.modelo.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRep extends JpaRepository<Color, Long> {
}
