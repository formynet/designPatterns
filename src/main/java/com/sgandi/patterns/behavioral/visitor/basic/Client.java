package com.sgandi.patterns.behavioral.visitor.basic;

import java.util.ArrayList;
import java.util.List;

public class Client {

  public static void main(String[] args) {
    Elementable elementA = new ElementA();
    Elementable elementB = new ElementB();
    Elementable elementC = new ElementC();
    Visitable visitor1 = new Visitor1();
    elementA.accept(visitor1);
    elementB.accept(visitor1);
    elementC.accept(visitor1);


    Visitable visitor2 = new Visitor2Multiplier();
    elementA.accept(visitor2);
    elementB.accept(visitor2);
    elementC.accept(visitor2);

    // Iterating all elements in the same way using iterator

    List<Elementable> elements = new ArrayList<>();
    elements.add(new ElementA());
    elements.add(new ElementB());
    elements.add(new ElementC());

    for (Elementable element : elements) {
      element.accept(visitor1);
    }

    for (Elementable element : elements) {
      element.accept(visitor2);
    }
  }

}
