package cl.acqui.api.core.recommendation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Recommendation {
  @Getter
  private final int productId;
  @Getter
  private final int recommendationId;
  @Getter
  private final String author;
  @Getter
  private final int rate;
  @Getter
  private final String content;
  @Getter
  private final String serviceAddress;

  public Recommendation() {
    productId = 0;
    recommendationId = 0;
    author = null;
    rate = 0;
    content = null;
    serviceAddress = null;
  }
}
