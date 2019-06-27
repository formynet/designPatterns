package com.sgandi.patterns.behavioral.visitor.bom;

public class Chassis extends Equipment {
  private long price;

  public Chassis(String name, long price) {
    super(name);
    this.price = price;
  }

  @Override
  public void accept(EquipmentVisitor visitor) {
    for (Equipment child : children) {
      child.accept(visitor);
    }
    visitor.visitChassis(this);

  }

  public long getCostPrice() { // Net cost price in cents
    return price;
  }
}
