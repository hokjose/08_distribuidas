package ms.venta.feign;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import ms.venta.dto.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-cliente-service")
public interface ClienteFeign {

    @GetMapping("/cliente/{id}")
    @CircuitBreaker(name = "clienteService", fallbackMethod = "fallbackCliente")
    Cliente getCliente(@PathVariable("id") Long id);

    default Cliente fallbackCliente(Long id, Throwable t) {
        System.err.println("Error al llamar al microservicio cliente: " + t.getMessage());
        Cliente c = new Cliente();
        c.setId(id);
        c.setNombre("CLIENTE NO DISPONIBLE");
        c.setDni("----");
        return c;
    }
}