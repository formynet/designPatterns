package com.sgandi.patterns.behavioral.iterator;

public class Client {

  public static void main(String[] args) {
    Aggregate1<String> ag = new Aggregate1<>();
    Iterator<String> it = ag.createIterator();
    ag.add("1");
    ag.add("2");
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

}
