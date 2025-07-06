package ms.venta.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class VentaResponse {
    private Long id;
    private Cliente cliente;
    private String tipoVenta;
    private String formaPago;
    private LocalDateTime fechaventa;
    private BigDecimal subtotal;
    private BigDecimal igv;
    private BigDecimal total;
}