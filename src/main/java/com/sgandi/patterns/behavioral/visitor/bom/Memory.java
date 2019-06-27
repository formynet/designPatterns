package com.sgandi.patterns.behavioral.visitor.bom;

public class Memory extends Equipment {
  private long price;

  public Memory(String name, long price) {
    super(name);
    this.price = price;
  }

  @Override
  public void accept(EquipmentVisitor visitor) {
    visitor.visitMemory(this);
  }

  public long getUnitPrice() { // Unit price in cents
    return price;
  }
}
