package com.sgandi.patterns.behavioral.observer.timer;

import java.util.Calendar;

public class Client {

  public static void main(String[] args) throws InterruptedException {
    Timer timer = new Timer(); // subject
    // Creating a clock (observer) and registering it on timer (subject).
    Clock clock = new Clock(timer);
    final Calendar calendar = Calendar.getInstance();
    for (int i = 0; i < 3; i++) {
      Thread.sleep(1000); // one second
      calendar.setTimeInMillis(System.currentTimeMillis());
      int h = calendar.get(Calendar.HOUR_OF_DAY);
      int m = calendar.get(Calendar.MINUTE);
      int s = calendar.get(Calendar.SECOND);
      // Changing timer's state every second.
      timer.tick(h, m, s);
    }
  }
}
