package cl.acqui.api.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ReviewSummary {

  @Getter
  private final int reviewId;
  @Getter
  private final String author;
  @Getter
  private final String subject;

}
