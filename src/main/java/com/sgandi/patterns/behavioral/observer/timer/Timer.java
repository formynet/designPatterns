package com.sgandi.patterns.behavioral.observer.timer;

public class Timer extends Subject {
  private int hour = 0;
  private int minute = 0;
  private int second = 0;

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  // Changing time of day and notifying observers.
  public void tick(int hour, int minute, int second) {
    System.out.printf("Timer  : Time of day changed to  :  %02d:%02d:%02d %n", hour, minute,
        second);
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    // Notifying observers that time has changed.
    notifyObservers();
  }
}
