package ms.producto.servicios.serviceimpl;

import ms.producto.modelo.Genero;
import ms.producto.repositorio.GeneroRep;
import ms.producto.servicios.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImp implements GeneroService {
    @Autowired
    GeneroRep generoRep;
    @Override
    public List<Genero> findAll() {
        return generoRep.findAll();
    }
}
