package com.sgandi.patterns.behavioural.state.basic;

import java.io.OutputStream;

public class MyApp {
  public static void main(String[] args) {
    OutputStream data = null;
    Connection connection = new Connection1(Closed.getInstance());
    connection.open();
    // ...
    connection.transmit(data);
    // ...
    connection.close();
  }
}
