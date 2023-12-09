import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "payment")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "method_id")
    private ConstValueEntity method;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private ConstValueEntity status;

    @Column(name = "ref_number")
    private String refNumber;

    @Column(name = "transaction_number")
    private String transactionNumber;
}
