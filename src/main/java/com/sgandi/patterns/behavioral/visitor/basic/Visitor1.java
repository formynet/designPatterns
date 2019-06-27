package com.sgandi.patterns.behavioral.visitor.basic;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Visitor1 implements Visitable {
  private static final Logger log =
      LoggerFactory.getLogger(MethodHandles.lookup().getClass().getName());

  @Override
  public void visitElementA(ElementA element) {
    log.info("Visiting elementA and its state is: {} ", element.getElementAInt());
    element.setElementAInt(10);
    log.info("Visiting elementA and operating on its state, new state is: {}",
        element.getElementAInt());
  }

  @Override
  public void visitElementB(ElementB element) {
    log.info("Visiting ElementB and its state is: {}", element.getElementBInt());
    element.setElementBInt(20);
    log.info("Visiting ElementB and operating on its state, new state is: {}",
        element.getElementBInt());

  }

  @Override
  public void visitElementC(ElementC element) {
    log.info("Visiting ElementC and its state is: {}", element.getElementCInt());
    element.setElementCInt(30);
    log.info("Visiting ElementC and operating on its state, new state is: {}",
        element.getElementCInt());


  }

}
