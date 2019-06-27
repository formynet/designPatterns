package com.sgandi.patterns.behavioral.strategy.basic;

public class Context {
  Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public static void main(String[] args) {
    Context con = new Context(new Strategy1());
    con.strategy.getStrategy();

    con = new Context(new Strategy2());
    con.strategy.getStrategy();


  }

}
