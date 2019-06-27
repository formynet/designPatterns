package com.sgandi.patterns.behavioral.strategy.basic;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Strategy1 implements Strategy {
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());

  @Override
  public void getStrategy() {
    log.info("In stragegy1.getStrategy");
  }

}
