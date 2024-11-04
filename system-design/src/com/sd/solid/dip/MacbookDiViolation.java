package com.sd.solid.dip;

/**
 * This class is violating the Dependency as if we pass the WierlessKeyboard or WierlessMouse object
 * then it will fail the and will give the compilation error. To resolve this we need to depend on
 * an interface object rather than direct concrete object.
 */
public class MacbookDiViolation {

  private final WierdKeyboard keyboard;
  private final WierdMouse mouse;

  public MacbookDiViolation(WierdMouse mouse, WierdKeyboard keyboard) {
    this.keyboard = keyboard;
    this.mouse = mouse;
  }

}
