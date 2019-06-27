package com.sgandi.patterns.behavioral.command.basic;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reciever {
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());

  public void action() {
    log.info("Performing reciver action...");
  }
}
