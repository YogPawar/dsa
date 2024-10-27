package com.practice.solid.lsp;

/**
 * This class is following LSP as we are implementing the parent class functionality also extending
 * our own feature as well.
 */
public class EBike implements Bike {

  @Override
  public void turnOnEngine() {
    // check engine of functionality
  }

  @Override
  public void accelerate() {
    //increase the speed
  }

  public void isCharge() {
    //is battery charge
  }
}
