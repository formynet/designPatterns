package com.sgandi.patterns.behavioral.visitor.basic;

public class ElementB implements Elementable {
  private int elementBInt;

  public int getElementBInt() {
    return elementBInt;
  }

  public void setElementBInt(int elementBInt) {
    this.elementBInt = elementBInt;
  }

  @Override
  public void accept(Visitable visitor) {
    visitor.visitElementB(this);
  }

}
