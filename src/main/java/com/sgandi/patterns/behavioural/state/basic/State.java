package com.sgandi.patterns.behavioural.state.basic;

import java.io.OutputStream;

public interface State {
  void open(Connection c);

  void transmit(Connection c, OutputStream data);

  void close(Connection c);
}
