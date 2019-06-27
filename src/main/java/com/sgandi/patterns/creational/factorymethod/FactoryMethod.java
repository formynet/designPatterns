package com.sgandi.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Product
 * 
 * ConcreteProduct
 * 
 * 
 * Factory
 * 
 * ConcreteFactor
 * 
 * 
 */

public class FactoryMethod {
  MazeGame ordinaryGame = new OrdinaryMazeGame();
  MazeGame magicGame = new MagicMazeGame();
}


abstract class Room {
  abstract void connect(Room room);
}


class MagicRoom extends Room {
  @Override
  public void connect(Room room) {}
}


class OrdinaryRoom extends Room {
  @Override
  public void connect(Room room) {}
}


abstract class MazeGame {
  private final List<Room> rooms = new ArrayList<>();

  public MazeGame() {
    Room room1 = makeRoom();
    Room room2 = makeRoom();
    room1.connect(room2);
    rooms.add(room1);
    rooms.add(room2);
  }

  abstract protected Room makeRoom();
}


class MagicMazeGame extends MazeGame {
  @Override
  protected Room makeRoom() {
    return new MagicRoom();
  }
}


class OrdinaryMazeGame extends MazeGame {
  @Override
  protected Room makeRoom() {
    return new OrdinaryRoom();
  }
}
