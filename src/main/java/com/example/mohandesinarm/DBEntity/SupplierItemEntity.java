import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "supplier_item")
public class SupplierItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private SellerEntity supplier;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private ItemEntity item;

    private int price;

    @Column(name = "discount_percentage")
    private int discountPercentage;

    @Column(name = "available_from")
    private java.sql.Timestamp availableFrom;

    @Column(name = "available_until")
    private java.sql.Timestamp availableUntil;

    private int quantity;

    @Column(name = "is_active")
    private boolean isActive;
}
