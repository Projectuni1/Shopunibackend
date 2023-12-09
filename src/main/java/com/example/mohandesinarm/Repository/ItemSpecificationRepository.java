import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemSpecificationRepository extends JpaRepository<ItemSpecificationEntity, Long> {
    // Custom queries can be added here if needed
}
