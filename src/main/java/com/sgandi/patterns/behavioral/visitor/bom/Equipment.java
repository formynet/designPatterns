package com.sgandi.patterns.behavioral.visitor.bom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Equipment {
  private String name;
  List<Equipment> children = new ArrayList<>();

  public Equipment(String name) {
    this.name = name;
  }

  //
  public abstract void accept(EquipmentVisitor visitor);

  //
  public String getName() {
    return this.name;
  }

  public boolean add(Equipment e) {
    return children.add(e);
  }

  public Iterator<Equipment> iterator() {
    return children.iterator();
  }

  public int getChildCount() {
    return children.size();
  }
}
