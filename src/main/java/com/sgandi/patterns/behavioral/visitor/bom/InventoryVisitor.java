package com.sgandi.patterns.behavioral.visitor.bom;

public class InventoryVisitor implements EquipmentVisitor {
  private Inventory inventory;

  public InventoryVisitor(Inventory inventory) {
    this.inventory = inventory;
  }

  @Override
  public void visitChassis(Chassis e) {
    inventory.operation(e);

  }

  @Override
  public void visitMainboard(Mainboard e) {
    inventory.operation(e);
  }

  @Override
  public void visitProcessor(Processor e) {
    inventory.operation(e);

  }

  @Override
  public void visitMemory(Memory e) {
    inventory.operation(e);

  }

  @Override
  public void visitDisk(Disk e) {
    inventory.operation(e);
  }

}
