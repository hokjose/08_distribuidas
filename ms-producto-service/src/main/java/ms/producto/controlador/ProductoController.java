package ms.producto.controlador;

import ms.producto.dto.UpdateStockDTO;
import ms.producto.modelo.Producto;
import ms.producto.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService service;

    @GetMapping
    public List<Producto> listar() {
        return service.findAll();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto obj) {
        return service.create(obj);
    }

    @PutMapping("/{id}")
    public Producto editar(@PathVariable Long id, @RequestBody Producto obj) {
        return service.update(id, obj);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.delete(id);
    }
    @PutMapping("/stock/{id}")
    public Producto actualizarStock(@PathVariable Long id, @RequestBody UpdateStockDTO dto) {
        return service.updateStock(id, dto.getStock());
    }
}
