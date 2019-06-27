package com.sgandi.patterns.behavioral.command.basic;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Invoker {
  private Command command;
  private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().getClass());


  public Invoker(Command command) {
    this.command = command;
  }

  public void operation() {
    log.info("Invoker  : Calling execute on the installed command ...  ");
    command.execute();
  }

  public static void main(String[] args) {
    Invoker invoker = new Invoker(new Command1(new Reciever()));
    invoker.operation();
  }
}
