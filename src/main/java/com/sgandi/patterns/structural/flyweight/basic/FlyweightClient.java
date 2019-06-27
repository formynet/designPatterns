package com.sgandi.patterns.structural.flyweight.basic;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyweightClient {
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());

  public static void main(String[] args) {
    Flyweight flyweight;
    // Getting a FlyweightFactory object.
    FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

    flyweight = flyweightFactory.getFlyweight("A");
    System.out.println(flyweight.operation(100));

    flyweight = flyweightFactory.getFlyweight("A");
    System.out.println(flyweight.operation(200));

    System.out
        .println("\n*** Number of flyweights created: " + flyweightFactory.getSize() + " ***");
  }
}
