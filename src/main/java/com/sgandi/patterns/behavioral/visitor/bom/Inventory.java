package com.sgandi.patterns.behavioral.visitor.bom;

public class Inventory {
  private int quantity = 10;

  public void operation(Equipment e) {
    // Calculating inventory (quantity in stock).
    // ...
    System.out.println("    Inventory for " + e.getName() + ": " + quantity);
  }
}
