import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "const_value")
public class ConstValueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ConstValueEntity parent;

    private String description;
}
