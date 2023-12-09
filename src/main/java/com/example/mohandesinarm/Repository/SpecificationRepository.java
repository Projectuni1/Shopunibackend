import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecificationRepository extends JpaRepository<SpecificationEntity, Long> {
    // Custom queries can be added here if needed
}
