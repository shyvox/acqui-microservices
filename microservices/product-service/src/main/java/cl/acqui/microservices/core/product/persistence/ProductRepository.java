package cl.acqui.microservices.core.product.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, Integer> {
    Optional<ProductEntity> findByProductId(int productId);

}
