package com.sgandi.patterns.behavioural.state.basic;


import java.io.OutputStream;

public abstract class Connection {
  public abstract void open();

  public abstract void transmit(OutputStream data);

  public abstract void close();

  abstract void setState(State state); // package private
}
