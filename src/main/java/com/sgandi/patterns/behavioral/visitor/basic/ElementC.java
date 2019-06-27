package com.sgandi.patterns.behavioral.visitor.basic;

public class ElementC implements Elementable {
  private int elementCInt;

  public int getElementCInt() {
    return elementCInt;
  }

  public void setElementCInt(int elementCInt) {
    this.elementCInt = elementCInt;
  }

  @Override
  public void accept(Visitable visitor) {
    visitor.visitElementC(this);
  }

}
