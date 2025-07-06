package ms.venta.controlador;

import ms.venta.modelo.TipoVenta;
import ms.venta.servicios.TipoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipoventa")
public class TipoVentaController {
    @Autowired
    TipoVentaService service;

    @GetMapping
    public List<TipoVenta> listar() {
        return service.findAll();
    }
}
