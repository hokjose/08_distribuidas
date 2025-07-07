package ms.producto.servicios.serviceimpl;

import ms.producto.modelo.Marca;
import ms.producto.repositorio.MarcaRep;
import ms.producto.servicios.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImp implements MarcaService {
    @Autowired
    MarcaRep marcaRep;


    @Override
    public List<Marca> findAll() {
        return marcaRep.findAll();
    }

    @Override
    public Marca create(Marca marca) {
        return marcaRep.save(marca);
    }

    @Override
    public Marca update(Long id, Marca marca) {
        Marca objmarca = marcaRep.findById(id).orElseThrow();
        objmarca.setMarca(marca.getMarca());
        return marcaRep.save(objmarca);
    }

    @Override
    public void delete(Long id) {
        marcaRep.deleteById(id);
    }
}
