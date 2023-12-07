import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "postal_address")
    private String postalAddress;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "current_wallet_credit")
    private int currentWalletCredit;
}
