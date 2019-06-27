package com.sgandi.patterns.behavioral.visitor.bom;



public interface EquipmentVisitor {
  public void visitChassis(Chassis e);

  public void visitMainboard(Mainboard e);

  public void visitProcessor(Processor e);

  public void visitMemory(Memory e);

  public void visitDisk(Disk e);
}
