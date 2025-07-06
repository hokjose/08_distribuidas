package ms.venta.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Cliente {
    private Long id;
    private String nombre;
    private String dni;
}