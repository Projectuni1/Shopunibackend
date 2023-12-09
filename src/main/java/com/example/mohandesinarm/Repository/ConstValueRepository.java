import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstValueRepository extends JpaRepository<ConstValueEntity, Long> {
    // Custom queries can be added here if needed
}
