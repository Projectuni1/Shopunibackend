import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "specification")
public class SpecificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    private String unit;
}
