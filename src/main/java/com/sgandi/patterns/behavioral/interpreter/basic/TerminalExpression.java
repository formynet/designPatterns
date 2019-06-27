package com.sgandi.patterns.behavioral.interpreter.basic;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerminalExpression extends AbstractExpression {

  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());

  public TerminalExpression(String name) {
    super(name);
  }

  @Override
  public void interpret(Context context) {
    log.info("interpreting...{}", getName());

  }

}
