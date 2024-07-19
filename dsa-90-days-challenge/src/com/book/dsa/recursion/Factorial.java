package com.book.dsa.recursion;

public class Factorial {

  private static long factorial(int n) {
    //base case
    if (n == 0) { //recur
      return 1;
    } else {
      return n * factorial(n - 1); // cursive call
    }
  }

  public static void main(String[] args) {
    System.out.println(factorial(10));

  }

}
