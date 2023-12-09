import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierItemRepository extends JpaRepository<SupplierItemEntity, Long> {
    // Custom queries can be added here if needed
}
