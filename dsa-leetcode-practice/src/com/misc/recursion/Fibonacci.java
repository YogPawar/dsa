package com.misc.recursion;

public class Fibonacci {

  private static int fibonacii(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacii(n - 1) + fibonacii(n - 2);
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 5; i++) {
      System.out.print(fibonacii(i) +" ");
    }
  }

}
