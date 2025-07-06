package ms.venta.servicios.serviceimpl;

import ms.venta.modelo.DetalleVenta;
import ms.venta.repositorio.DetalleVentaRep;
import ms.venta.servicios.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaServiceImp implements DetalleVentaService {
    @Autowired
    DetalleVentaRep repository;

    @Override
    public List<DetalleVenta> findAll() {
        return repository.findAll();
    }
    @Override
    public DetalleVenta create(DetalleVenta detalleventa) {
        return repository.save(detalleventa);
    }
}
