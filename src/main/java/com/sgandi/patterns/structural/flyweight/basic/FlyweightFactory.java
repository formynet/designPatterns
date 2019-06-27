package com.sgandi.patterns.structural.flyweight.basic;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
  private static final FlyweightFactory INSTANCE = new FlyweightFactory();

  private FlyweightFactory() {}

  public static FlyweightFactory getInstance() {
    return INSTANCE;
  }

  private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

  public Flyweight getFlyweight(String key) {
    if (flyweights.containsKey(key)) {
      System.out.println("S h a r i n g    a flyweight with key = " + key);
      return flyweights.get(key);
    } else {
      System.out.println("C r e a t i n g  a flyweight with key = " + key);
      Flyweight flyweight = new FlyweightIntrinsic(key); // assuming key = intrinsic state
      flyweights.put(key, flyweight);
      return flyweight;
    }
  }

  public int getSize() {
    return flyweights.size();
  }
}
