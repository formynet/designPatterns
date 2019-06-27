package com.sgandi.patterns.behavioral.observer.basic;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
  private List<Observer> observers;

  public Subject() {
    observers = new ArrayList<>();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void detach(Observer observer) {
    observers.remove(observer);
  }


  public void updateAll() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

}
