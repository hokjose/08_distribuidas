package ms.venta.controlador;

import ms.venta.dto.VentaResponse;
import ms.venta.modelo.Venta;
import ms.venta.servicios.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaService service;

    @GetMapping
    public List<VentaResponse> listar() {
        return service.findAll();
    }

    @PostMapping
    public Venta guardar(@RequestBody Venta obj) {
        return service.create(obj);
    }
}
