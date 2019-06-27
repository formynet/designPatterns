package com.sgandi.patterns.behavioral.interpreter.basic;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NonTerminalExpression extends AbstractExpression {
  private List<AbstractExpression> expressions;
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());

  public NonTerminalExpression(String name) {
    super(name);
    expressions = new ArrayList<>();
  }

  public boolean addExpression(AbstractExpression expression) {
    return expressions.add(expression);
  }

  @Override
  public void interpret(Context context) {
    log.info("interpreting...{}", getName());
    for (AbstractExpression expression : expressions) {
      // log.info("interpreting....{}", expression.getName());
      expression.interpret(context);
    }

  }

}
