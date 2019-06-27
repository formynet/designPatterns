package com.sgandi.patterns.behavioral.mediator.basic;

public class Colleague2 extends Colleague {
  private String state;

  public Colleague2(Mediator mediator) {
    super(mediator);
  }

  public String getState() {
    return state;
  }

  void setState(String state) {
    if (!state.contentEquals(this.state)) {
      this.state = state;
      System.out.println(
          "    Colleague2: My state changed to: " + this.state + " Calling my mediator ...");
      mediator.mediate(this);
    }
  }

  void action2(String state) {
    // For example, synchronizing and displaying state.
    this.state = state;
    System.out.println("    Colleague2: My state synchronized to: " + this.state);
  }
}
