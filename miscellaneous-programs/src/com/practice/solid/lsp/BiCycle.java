package com.practice.solid.lsp;

/**
 * In this class we are breaking the Liskov Substitution pattern as we are narrow downing the
 * problem by removing turnOnEngine feature.
 */
public class BiCycle implements Bike {

  @Override
  public void turnOnEngine() {
    throw new AssertionError("There is no engine");
  }

  @Override
  public void accelerate() {
    //do something
  }
}
