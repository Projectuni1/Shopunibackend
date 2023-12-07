import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "item")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private String description;

    @Lob
    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
