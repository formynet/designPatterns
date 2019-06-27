package com.sgandi.patterns.behavioral.command.basic;

public class Command1 implements Command {
  Reciever reciever;

  public Command1(Reciever reciever) {
    this.reciever = reciever;
  }

  @Override
  public void execute() {
    reciever.action();

  }

}
