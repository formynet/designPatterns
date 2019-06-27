package com.sgandi.patterns.behavioral.visitor.bom;



public class MyApp {
  public static void main(String[] args) {
    Equipment mainboard = new Mainboard("Mainboard", 100);
    mainboard.add(new Processor("Processor", 100));
    mainboard.add(new Memory("Memory   ", 100));
    Equipment chassis = new Chassis("Chassis  ", 100);
    chassis.add(mainboard);
    chassis.add(new Disk("Disk     ", 100));

    System.out.println("(1) Traversing the BOM using a pricing visitor: ");
    PricingVisitor pricingVisitor = new PricingVisitor();
    chassis.accept(pricingVisitor);
    System.out.println("    Number of components: " + pricingVisitor.getNumberOfElements()
        + "\n    Total price         : " + pricingVisitor.getTotalPrice());

    System.out.println("(2) Traversing the BOM using an inventory visitor: ");
    InventoryVisitor inventoryVisitor = new InventoryVisitor(new Inventory());
    chassis.accept(inventoryVisitor);
  }
}
