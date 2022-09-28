package cl.acqui.api.core.recommendation;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RecommendationService {

  Mono<Recommendation> createRecommendation(Recommendation body);

  @GetMapping(
    value = "/recommendation",
    produces = "application/json"
  )
  Flux<Recommendation> getRecommendations(@RequestParam(value = "productId", required = true) int productId);

  Mono<Void> deleteRecommendations(int productId);
  /*
  @PostMapping(
          value    = "/recommendation",
          consumes = "application/json",
          produces = "application/json")
  Recommendation createRecommendation(@RequestBody Recommendation body);


  @GetMapping(
          value = "/recommendation",
          produces = "application/json")
  List<Recommendation> getRecommendations(
          @RequestParam(value = "productId", required = true) int productId);


  @DeleteMapping(value = "/recommendation")
  void deleteRecommendations(@RequestParam(value = "productId", required = true)  int productId);


   */
}