package ms.venta.servicios.serviceimpl;

import ms.venta.modelo.TipoVenta;
import ms.venta.repositorio.TipoVentaRep;
import ms.venta.servicios.TipoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoVentaServiceImp implements TipoVentaService {
    @Autowired
    TipoVentaRep repository;

    @Override
    public List<TipoVenta> findAll() {
        return repository.findAll();
    }
}
