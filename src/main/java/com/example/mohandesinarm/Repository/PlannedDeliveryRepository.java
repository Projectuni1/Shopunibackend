import org.springframework.data.jpa.repository.JpaRepository;

public interface PlannedDeliveryRepository extends JpaRepository<PlannedDeliveryEntity, Long> {
    // Custom queries can be added here if needed
}
