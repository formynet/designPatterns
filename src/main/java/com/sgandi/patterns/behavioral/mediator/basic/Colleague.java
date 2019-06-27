package com.sgandi.patterns.behavioral.mediator.basic;

public abstract class Colleague {
  Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }
}
