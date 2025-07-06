package ms.cliente.servicios;

import ms.cliente.modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<Cliente> findAll();
    Optional<Cliente> findById(Long id);
    Cliente save(Cliente obj);
    Cliente update(Long id, Cliente obj);
    void delete(Long id);
}
