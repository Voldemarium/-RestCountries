package ru.synergy.model.v3;

import ru.synergy.model.base.BaseCountry;
import java.util.List;

public class Country extends BaseCountry {
  private List<String> flags;

  public List<String> getFlags() {
    return flags;
  }

  public void setFlags(List<String> flags) {
    this.flags = flags;
  }
}
