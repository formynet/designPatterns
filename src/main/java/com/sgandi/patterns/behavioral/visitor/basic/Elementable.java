package com.sgandi.patterns.behavioral.visitor.basic;

public interface Elementable {
  void accept(Visitable visitor);
}
