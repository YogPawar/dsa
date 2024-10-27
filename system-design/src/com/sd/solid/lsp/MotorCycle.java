package com.sd.solid.lsp;

/**
 * If class B is subtype of Class A  then we should  be able to replace the object of A with B
 * without breaking the behaviour of the program.
 * <p>
 * Subclass should extend the capability of parent class not narrow it down.
 */
public class MotorCycle implements Bike {

  boolean isEngineOn;
  int speed;

  @Override
  public void turnOnEngine() {
    isEngineOn = true;
    System.out.println("Engine is ON");

  }

  @Override
  public void accelerate() {
    System.out.println("Bike Speed is " + speed);
  }
}
