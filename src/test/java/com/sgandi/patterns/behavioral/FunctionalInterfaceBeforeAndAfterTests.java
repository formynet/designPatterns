package com.sgandi.patterns.behavioral;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FunctionalInterfaceBeforeAndAfterTests {
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  public static void main(String[] args) {
    Procedure procedure1 = () -> log.info("P1");
    Procedure procedure2 = () -> log.info("p2");

    procedure1.andThen(procedure2).run();
    procedure1.compose(procedure2).run();


  }

}
