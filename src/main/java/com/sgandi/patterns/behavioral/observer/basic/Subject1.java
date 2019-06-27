package com.sgandi.patterns.behavioral.observer.basic;

public class Subject1 extends Subject {
  private int state;

  public Subject1() {
    super();
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    this.updateAll();
  }


}
