package com.sgandi.patterns.behavioral.observer.basic;

public class MyApp {

  public static void main(String[] args) {
    Subject1 sub1 = new Subject1();
    Observer1 obs1 = new Observer1(sub1);
    Observer2 obs2 = new Observer2(sub1);

    sub1.attach(obs1);
    sub1.attach(obs2);

    sub1.setState(100);
    sub1.setState(10);

    sub1.detach(obs1);
    sub1.setState(5);
  }
}
