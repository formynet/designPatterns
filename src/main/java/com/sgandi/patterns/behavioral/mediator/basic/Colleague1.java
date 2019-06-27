package com.sgandi.patterns.behavioral.mediator.basic;

public class Colleague1 extends Colleague {
  private String state;

  public Colleague1(Mediator mediator) {
    super(mediator); // Calling the super class constructor
  }

  public String getState() {
    return state;
  }

  void setState(String state) {
    if (state != this.state) {
      this.state = state;
      System.out.println(
          "    Colleague1: My state changed to: " + this.state + " Calling my mediator ...");
      mediator.mediate(this);
    }
  }

  void action1(String state) {
    // For example, synchronizing and displaying state.
    this.state = state;
    System.out.println("    Colleague1: My state synchronized to: " + this.state);
  }
}
