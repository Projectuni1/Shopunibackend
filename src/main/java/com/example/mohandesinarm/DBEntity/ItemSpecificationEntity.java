import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "item_specification")
public class ItemSpecificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private ItemEntity item;

    @ManyToOne
    @JoinColumn(name = "specification_id")
    private SpecificationEntity specification;

    private String value;
}
