package ms.venta.servicios;

import ms.venta.modelo.DetalleVenta;

import java.util.List;

public interface DetalleVentaService {
    List<DetalleVenta> findAll();
    DetalleVenta create(DetalleVenta detalleventa);
}

