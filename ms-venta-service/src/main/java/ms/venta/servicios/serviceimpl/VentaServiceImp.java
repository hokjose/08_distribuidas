package ms.venta.servicios.serviceimpl;

import ms.venta.dto.VentaResponse;
import ms.venta.feign.ClienteFeign;
import ms.venta.modelo.Venta;
import ms.venta.repositorio.VentaRep;
import ms.venta.servicios.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImp implements VentaService {
    @Autowired
    VentaRep repository;
    @Autowired
    private ClienteFeign clienteFeign;

    @Override
    public List<VentaResponse> findAll() {
        return repository.findAll().stream().map(venta -> {
            return VentaResponse.builder()
                    .id(venta.getId())
                    .cliente(clienteFeign.getCliente(venta.getIdcliente()))
                    .tipoVenta(venta.getTipoventa().getTipoventa())
                    .formaPago(venta.getFormapago().getFormapago())
                    .fechaventa(venta.getFechaventa())
                    .subtotal(venta.getSubtotal())
                    .igv(venta.getIgv())
                    .total(venta.getTotal())
                    .build();
        }).toList();
    }

    @Override
    public Venta create(Venta venta) {
        return repository.save(venta);
    }

    @Override
    public Venta findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
