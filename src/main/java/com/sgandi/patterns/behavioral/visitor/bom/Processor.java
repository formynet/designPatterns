package com.sgandi.patterns.behavioral.visitor.bom;

public class Processor extends Equipment {
  private long price;

  public Processor(String name, long price) {
    super(name);
    this.price = price;
  }

  @Override
  public void accept(EquipmentVisitor visitor) {
    visitor.visitProcessor(this);
  }

  public long getUnitPrice() { // Unit price in cents
    return price;
  }



}
