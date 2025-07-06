package ms.cliente.servicios.serviceimpl;

import ms.cliente.modelo.Cliente;
import ms.cliente.repositorio.ClienteRep;
import ms.cliente.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImp implements ClienteService {
    @Autowired
    ClienteRep repository;


    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Cliente save(Cliente obj) {
        return repository.save(obj);
    }

    @Override
    public Cliente update(Long id, Cliente obj) {
        obj.setId(id);
        return repository.save(obj);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
