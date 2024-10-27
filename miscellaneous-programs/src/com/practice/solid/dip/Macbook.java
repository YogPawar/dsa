package com.practice.solid.dip;

public class Macbook {

  private final Keyboard keyboard;
  private final Mouse mouse;

  public Macbook(Keyboard keyboard, Mouse mouse) {
    this.keyboard = keyboard;
    this.mouse = mouse;
  }

  public void mouseType() {
    mouse.getMouse();
  }

  public void keyBoardType() {
    keyboard.getKeyboard();
  }
}
