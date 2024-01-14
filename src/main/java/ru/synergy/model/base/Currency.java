package ru.synergy.model.base;

public class Currency {
  private String name;
  private String symbol;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Currency{" +
            "name='" + name + '\'' +
            ", symbol='" + symbol + '\'' +
            '}';
  }
}
