package com.leetcode.array.eassy;

public class FinalValueAfterPerformOperations {

  public static void main(String[] args) {
    String[] operator = {"++X", "X++", "--X", "X--", "X++", "X++", "--X"};
    int x = perfromOperation(operator);
    System.out.println(x);

  }

  private static int perfromOperation(String[] operator) {
    int x = 0;
    for (String ch : operator) {
      if (ch.charAt(1) == '-') {
        x--;
      } else {
        x++;
      }
    }
    return x;
  }
}
