package com.sgandi.patterns.behavioral.momento;

public class Originator {
  // Hiding internal state.
  private String state;

  // ...
  // Saving internal state.
  public Memento createMemento() {
    Memento memento = new Memento();
    memento.setState(state);
    return memento;
  }

  // Restoring internal state.
  void restore(Memento memento) {
    state = memento.getState();
  }

  //
  public String getState() {
    return state;
  }

  void setState(String state) {
    this.state = state;
  }

  //
  // Implementing Memento as inner class.
  // All members are private and accessible only by originator.
  //
  public class Memento {
    // Storing Originator's internal state.
    private String state;

    // ...
    private String getState() {
      return state;
    }

    private void setState(String state) {
      this.state = state;
    }
  }
}
