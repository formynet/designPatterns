package com.sgandi.patterns.behavioral.interpreter.basic;

public class Client {


  public static void main(String[] args) {
    NonTerminalExpression ntExp = new NonTerminalExpression("expression 1.2");
    ntExp.addExpression(new TerminalExpression("2.1"));
    ntExp.addExpression(new TerminalExpression("2.2"));

    NonTerminalExpression ntExp1 = new NonTerminalExpression("expression 0.1");
    ntExp1.addExpression(new TerminalExpression("1.1"));
    ntExp1.addExpression(ntExp);
    ntExp1.addExpression(new TerminalExpression("1.3"));

    ntExp1.interpret(new Context());
  }
}
