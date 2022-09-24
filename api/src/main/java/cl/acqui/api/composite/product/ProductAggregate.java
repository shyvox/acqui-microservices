package cl.acqui.api.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class ProductAggregate {
  @Getter
  private final int productId;
  @Getter
  private final String name;
  @Getter
  private final int weight;
  @Getter
  private final List<RecommendationSummary> recommendations;
  @Getter
  private final List<ReviewSummary> reviews;
  @Getter
  private final ServiceAddresses serviceAddresses;
}
