package ms.producto.servicios.serviceimpl;

import ms.producto.modelo.Color;
import ms.producto.repositorio.ColorRep;
import ms.producto.servicios.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImp implements ColorService {
    @Autowired
    ColorRep colorRep;

    @Override
    public List<Color> findAll() {
        return colorRep.findAll();
    }
}
