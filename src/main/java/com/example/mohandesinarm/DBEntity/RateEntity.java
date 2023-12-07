import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "rate")
public class RateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private ItemEntity item;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    private int value;

    @Column(name = "created_at")
    private java.sql.Timestamp createdAt;
}
