package cl.acqui.api.core.product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

public interface ProductService {

  Mono<Product> createProduct(Product body);


  @GetMapping(
          value = "/product/{productId}",
          produces = "application/json")
  Mono<Product> getProduct(@PathVariable int productId);

  Mono<Void> deleteProduct(int productId);
}
