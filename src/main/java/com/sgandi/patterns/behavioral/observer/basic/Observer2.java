package com.sgandi.patterns.behavioral.observer.basic;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Observer2 implements Observer {
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());
  Subject1 sub1;

  public Observer2(Subject1 sub1) {
    this.sub1 = sub1;
  }

  @Override
  public void update() {
    log.info("New state of subject is: {}", sub1.getState());
  }

}
