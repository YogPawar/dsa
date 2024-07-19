package com.book.dsa.recursion;

public class FibonacciNumber {

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


  public static void main(String[] args) {
    System.out.println(fibonacciNumber(9));
    printFibonacee(9);
  }
}
