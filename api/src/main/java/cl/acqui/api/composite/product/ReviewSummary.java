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

  @Getter
  private final String content;

  public ReviewSummary() {
    this.reviewId = 0;
    this.author = null;
    this.subject = null;
    this.content = null;
  }
}
