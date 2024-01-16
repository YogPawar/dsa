package com.misc.classes;

public class Main {

  public static void main(String[] args) {
    Cookie cookieOne = new Cookie("green");
    System.out.println(cookieOne.getColor());

    Cookie cookieTwo = new Cookie("blue");
    System.out.println(cookieTwo.getColor());

    cookieOne.setColor("red");
    System.out.println(cookieOne.getColor());
  }

}
