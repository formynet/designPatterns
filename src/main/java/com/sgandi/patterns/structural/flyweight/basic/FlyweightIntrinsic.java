package com.sgandi.patterns.structural.flyweight.basic;

public class FlyweightIntrinsic implements Flyweight {

  private String intrinsicState;

  public FlyweightIntrinsic(String intrinsicState) {
    this.intrinsicState = intrinsicState;
  }


  @Override
  public String operation(int extrinsicState) {
    return "  performing an operation on the flyweight\n " + " with intrinsic state = "
        + intrinsicState + " and passed in extrinsic state = " + extrinsicState + ".";
  }


}
