package com.sgandi.patterns.behavioral.visitor.bom;

public class PricingVisitor implements EquipmentVisitor {
  private int count = 0;
  private long sum = 0;

  @Override
  public void visitChassis(Chassis e) {
    count++;
    sum += e.getCostPrice();
  }

  @Override
  public void visitMainboard(Mainboard e) {
    count++;
    sum += e.getBasicPrice();
  }

  @Override
  public void visitProcessor(Processor e) {
    count++;
    sum += e.getUnitPrice();
  }

  @Override
  public void visitMemory(Memory e) {
    count++;
    sum += e.getUnitPrice();
  }

  @Override
  public void visitDisk(Disk e) {
    count++;
    sum += e.getUnitPrice();
  }

  public int getNumberOfElements() {
    return count;
  }

  public long getTotalPrice() {
    return sum;
  }
}
