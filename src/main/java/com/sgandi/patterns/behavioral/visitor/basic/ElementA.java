package com.sgandi.patterns.behavioral.visitor.basic;

public class ElementA implements Elementable {
  private int elementAInt;

  public int getElementAInt() {
    return elementAInt;
  }

  public void setElementAInt(int elementAInt) {
    this.elementAInt = elementAInt;
  }

  @Override
  public void accept(Visitable visitor) {
    visitor.visitElementA(this);
  }

}
