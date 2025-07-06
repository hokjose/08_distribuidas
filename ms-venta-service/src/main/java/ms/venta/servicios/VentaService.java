package ms.venta.servicios;

import ms.venta.dto.VentaResponse;
import ms.venta.modelo.Venta;

import java.util.List;

public interface VentaService{
    public List<VentaResponse> findAll();
    Venta create(Venta venta);
    Venta findById(Long id);
}
