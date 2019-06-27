package com.sgandi.patterns.behavioural.state.basic;

import java.io.OutputStream;

public class Connection1 extends Connection {
  private State state;

  // Configuring Context with a State.
  public Connection1(State state) {
    this.state = state;
  }

  @Override
  public void open() {
    state.open(this);
  }

  @Override
  public void transmit(OutputStream data) {
    state.transmit(this, data);
  }

  @Override
  public void close() {
    state.close(this);
  }

  void setState(State state) {
    this.state = state;
  }
}
