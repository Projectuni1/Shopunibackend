import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "planned_delivery")
public class PlannedDeliveryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "from_time")
    private java.sql.Time fromTime;

    @Column(name = "until_time")
    private java.sql.Time untilTime;

    private boolean saturday;
    private boolean sunday;
    private boolean monday;
    private boolean tuesday;
    private boolean wednesday;
    private boolean thursday;
    private boolean friday;
}
