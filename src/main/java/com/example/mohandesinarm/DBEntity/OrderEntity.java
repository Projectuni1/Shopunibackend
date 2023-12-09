import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "delivery_type_id")
    private ConstValueEntity deliveryType;

    @ManyToOne
    @JoinColumn(name = "order_status_id")
    private ConstValueEntity orderStatus;

    @ManyToOne
    @JoinColumn(name = "planned_delivery_chunk_id")
    private PlannedDeliveryEntity plannedDeliveryChunk;

    @Column(name = "delivery_cost")
    private int deliveryCost;

    @Column(name = "delivery_at")
    private java.sql.Date deliveryAt;

    @Column(name = "delivered_at")
    private java.sql.Timestamp deliveredAt;
}
