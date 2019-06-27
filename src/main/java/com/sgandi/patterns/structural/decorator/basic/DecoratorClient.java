package com.sgandi.patterns.structural.decorator.basic;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Component {
  String operation();
}


class Component1 implements Component {

  @Override
  public String operation() {
    String result = "component1 operation";
    return result;
  }

}


abstract class Decorator implements Component {
  private Component component;

  public Decorator(Component comp) {
    this.component = comp;
  }

  @Override
  public String operation() {
    return component.operation();
  }

}


class Decorator1 extends Decorator {
  public Decorator1(Component comp) {
    super(comp);

  }

  @Override
  public String operation() {

    return addBehavior(super.operation());
  }

  private String addBehavior(String result) {
    String dec1 = "Added dec1 to :" + result;
    return dec1;
  }
}


class Decorator2 extends Decorator {

  public Decorator2(Component comp) {
    super(comp);

  }

  @Override
  public String operation() {

    return addBehavior(super.operation());
  }

  private String addBehavior(String result) {
    String dec1 = "Added dec2 to :" + result;
    return dec1;
  }
}


public class DecoratorClient {
  private static final Logger log =
      LoggerFactory.getLogger(MethodHandles.lookup().getClass().getName());

  public static void main(String[] args) {
    Component comp1 = new Component1();
    Decorator dec = new Decorator1(new Decorator2(comp1));
    final String res = dec.operation();
    log.info(res);
  }
}
