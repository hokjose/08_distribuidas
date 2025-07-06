package ms.venta.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="venta")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "idcliente")
    private Long idcliente;

    @ManyToOne
    @JoinColumn(name = "idTipoVenta", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_TIPOVENTA_VENTA"))
    private TipoVenta tipoventa;

    @ManyToOne
    @JoinColumn(name = "idFormaPago", referencedColumnName = "id",
            nullable = false, foreignKey = @ForeignKey(name = "FK_FORMAPAGO_VENTA"))
    private FormaPago formapago;

    @Column(name = "fechaventa")
    private LocalDateTime fechaventa;

    @PrePersist
    public void prePersist() {
        this.fechaventa = LocalDateTime.now();
    }

    private BigDecimal subtotal;
    private BigDecimal igv;
    private BigDecimal total;
}
