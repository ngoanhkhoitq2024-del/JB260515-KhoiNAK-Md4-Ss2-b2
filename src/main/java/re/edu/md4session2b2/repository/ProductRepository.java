package re.edu.md4session2b2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import re.edu.md4session2b2.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
