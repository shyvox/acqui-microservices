package cl.acqui.api.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
public class ServiceAddresses {
  @Getter
  private final String cmp;
  @Getter
  private final String pro;
  @Getter
  private final String rev;
  @Getter
  private final String rec;
  public ServiceAddresses() {
    cmp = null;
    pro = null;
    rev = null;
    rec = null;
  }

}
