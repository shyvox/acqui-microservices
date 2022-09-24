package cl.acqui.api.core.review;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Review {
  @Getter
  private final int productId;
  @Getter
  private final int reviewId;
  @Getter
  private final String author;
  @Getter
  private final String subject;
  @Getter
  private final String content;
  @Getter
  private final String serviceAddress;

  public Review() {
    productId = 0;
    reviewId = 0;
    author = null;
    subject = null;
    content = null;
    serviceAddress = null;
  }
}
