import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<RateEntity, Long> {
    // Custom queries can be added here if needed
}
