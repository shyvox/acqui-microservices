package cl.acqui.api.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
public class RecommendationSummary {

  @Getter
  private final int recommendationId;
  @Getter
  private final String author;
  @Getter
  private final int rate;

}
