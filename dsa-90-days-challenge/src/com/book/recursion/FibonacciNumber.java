package com.book.recursion;

public class FibonacciNumber {

  static int a = 0, b = 1, c = 0;

  private static int fibonacciNumber(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
  }

  private static void printFibonacee(int term) {
    int a = 0;
    int b = 1;
    int c = 0;

    for (int i = 1; i <= term; i++) {
      System.out.print(a + " ");
      //swap the number
      c = a + b;
      a = b;
      b = c;
    }
  }

  private static void fibonacee(int n) {
    if (n > -1) {
      c = a + b;
      a = b;
      b = c;
      System.out.print(" " + c);
      fibonacee(n - 1);
    }

  }


  public static void main(String[] args) {
    printFibonacee(5);
  }
}
