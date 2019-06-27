package com.sgandi.patterns.behavioral.mediator.basic;

public class Mediator1 extends Mediator {
  private Colleague1 colleague1;
  private Colleague2 colleague2;

  void setColleagues(Colleague1 colleague1, Colleague2 colleague2) {
    this.colleague1 = colleague1;
    this.colleague2 = colleague2;
  }

  public void mediate(Colleague colleague) {
    System.out.println("    Mediator  : Mediating the interaction ...");
    // Message from colleague1 that its state has changed.
    if (colleague == colleague1) {
      // Performing an action on colleague2.
      String state = colleague1.getState();
      colleague2.action2(state);
    }
    // Message from colleague2 that its state has changed.
    if (colleague == colleague2) {
      // Performing an action on colleague1.
      String state = colleague2.getState();
      colleague1.action1(state);
    }
  }
}
