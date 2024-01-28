package dsa.com.recursion;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class FactorialNumber {

  public static void main(String[] args) {
    int factorial = factorial(4);
    System.out.println(factorial);
  }

  private static int factorial(int num) {
    if (num == 0) {
      return 1;
    }
    return num * factorial(num - 1);
  }
}

