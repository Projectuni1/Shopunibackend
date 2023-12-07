import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "seller")
public class SellerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "shop_name")
    private String shopName;
}
