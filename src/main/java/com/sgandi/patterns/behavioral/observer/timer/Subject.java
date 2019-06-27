package com.sgandi.patterns.behavioral.observer.timer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
  private List<Observer> observers = new ArrayList<>();

  // Registration interface.
  public void attach(Observer o) {
    observers.add(o);
  }

  // Notification interface.
  public void notifyObservers() {
    for (Observer o : observers)
      o.update(this);
  }
}
