package com.book.recursion;

public class PrintHello {

  static int count = 1;

  private static void hello() {

    if (count == 6) {
      return;
    } else {
      System.out.println("Hello : " + count);
      count++;
      hello();
    }

  }

  public static void main(String[] args) {
    hello();
  }

}
