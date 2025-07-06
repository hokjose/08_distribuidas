package ms.cliente.controller;

import ms.cliente.modelo.Cliente;
import ms.cliente.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping
    public List<Cliente> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Cliente obtenerPorId(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente obj) {
        return service.save(obj);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente obj) {
        return service.update(id, obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
