package com.sgandi.patterns.behavioural.state.basic;

import java.io.OutputStream;

public class Closed implements State {
  // Implemented as Singleton.
  private static final Closed INSTANCE = new Closed();

  private Closed() {}

  public static Closed getInstance() {
    return INSTANCE;
  }

  //
  @Override
  public void open(Connection c) {
    // ...
    c.setState(Connected.getInstance());
    System.out.println("State changed from CLOSED to CONNECTED.");
  }

  public void transmit(Connection c, OutputStream data) {
    System.out.println("State CLOSED: *** Can't transmit data " + "(connection is closed). ***");
    System.exit(-1);
  }

  @Override
  public void close(Connection c) {
    System.out
        .println("State CLOSED: *** Can't close connection " + "(connection already closed). ***");
    System.exit(-1);
  }
}
