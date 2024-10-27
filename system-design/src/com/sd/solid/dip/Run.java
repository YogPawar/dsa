package com.sd.solid.dip;

public class Run {

  public static void main(String[] args) {
    WierdMouse mouse = new WierdMouse();
    WierdKeyboard keyboard = new WierdKeyboard();
    WierlessKeyboard wierlessKeyboard = new WierlessKeyboard();
    WierlessMouse wierlessMouse = new WierlessMouse();

    Macbook macbook = new Macbook(wierlessKeyboard, mouse);
    macbook.keyBoardType();
    macbook.mouseType();
    Macbook macbook2 = new Macbook(keyboard, wierlessMouse);
    macbook2.keyBoardType();
    macbook2.mouseType();

  }
}
