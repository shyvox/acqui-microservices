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

  @Getter
  private final String content;

  public RecommendationSummary() {
    this.recommendationId = 0;
    this.author = null;
    this.rate = 0;
    this.content = null;
  }
}