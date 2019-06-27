package com.sgandi.patterns.behavioral.visitor.bom;

public class Mainboard extends Equipment {
  private long price;

  public Mainboard(String name, long price) {
    super(name);
    this.price = price;
  }

  @Override
  public void accept(EquipmentVisitor visitor) {

    for (Equipment child : children) {
      child.accept(visitor);
    }
    visitor.visitMainboard(this);
  }

  public long getBasicPrice() { // Basic price in cents
    return price;
  }
}
