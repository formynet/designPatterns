package com.sgandi.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Aggregate1<E> implements Aggregate<E> {

  int index = 0;
  List<E> elements;

  public Aggregate1() {
    elements = new ArrayList<>();
  }

  public void add(E element) {
    elements.add(element);
  }

  @Override
  public Iterator<E> createIterator() {

    return new Iterator1();
  }

  private class Iterator1 implements Iterator<E> {

    @Override
    public E next() {

      return elements.get(index++);
    }

    @Override
    public boolean hasNext() {
      return index < elements.size();
    }

  }
}
