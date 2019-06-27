package com.sgandi.patterns.behavioral.iterator;

public interface Aggregate<E> {
  Iterator<E> createIterator();
}
