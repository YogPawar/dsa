package com.misc;

public class Main {

  /**
   * This is O(n) time complexity
   *
   * @param n
   */
  public static void printStack(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(i);
    }
  }

  /**
   * This method is content O(n~2)
   *
   * @param n
   */
  public static void printStackTime(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
      }

    }
  }

  /**
   * This is O(1) time complexity
   *
   * @param n
   * @return
   */
  public static int addItems(int n) {
    return n + n;
  }


  public static void main(String[] args) {
    System.out.println("Hello DSA");
    printStack(10);
    printStackTime(10);
    addItems(2);

  }

}
