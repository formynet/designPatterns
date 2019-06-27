package com.sgandi.patterns.behavioral.iterator;

public interface Iterator<E> {
  E next();

  boolean hasNext();
}
