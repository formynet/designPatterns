package com.sgandi.patterns.behavioral.visitor.bom;

public class Disk extends Equipment {
  private long price;

  public Disk(String name, long price) {
    super(name);
    this.price = price;
  }

  @Override
  public void accept(EquipmentVisitor visitor) {
    visitor.visitDisk(this);
  }

  public long getUnitPrice() { // Unit price in cents
    return price;
  }

}
