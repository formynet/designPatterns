package com.sgandi.patterns.behavioral.interpreter.basic;

public abstract class AbstractExpression {
  String name;

  public AbstractExpression(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void interpret(Context context);
}
