package com.sgandi.patterns.behavioral.observer.timer;

public class Clock extends Observer {
  private Timer subject;

  public Clock(Timer subject) {
    this.subject = subject;
    // Registering this clock on subject.
    subject.attach(this);
  }

  @Override
  public void update(Subject s) {
    if (this.subject == s) {
      System.out.printf("Clock  : Updated/Synchronized to :  %02d:%02d:%02d %n", subject.getHour(),
          subject.getMinute(), subject.getSecond());
    }
  }
}
