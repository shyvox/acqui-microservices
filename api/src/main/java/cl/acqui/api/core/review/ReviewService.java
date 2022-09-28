package cl.acqui.api.core.review;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReviewService {

  Mono<Review> createReview(Review body);

  @GetMapping(
    value = "/review",
    produces = "application/json"
  )
  Flux<Review> getReviews(@RequestParam(value = "productId", required = true) int productId);

  Mono<Void> deleteReviews(int productId);
  /*
  @PostMapping(
          value    = "/review",
          consumes = "application/json",
          produces = "application/json")
  Review createReview(@RequestBody Review body);


  @GetMapping(
          value = "/review",
          produces = "application/json")
  List<Review> getReviews(@RequestParam(value = "productId", required = true) int productId);


  @DeleteMapping(value = "/review")
  void deleteReviews(@RequestParam(value = "productId", required = true)  int productId);

   */
}
