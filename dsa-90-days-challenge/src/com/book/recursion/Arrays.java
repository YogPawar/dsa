package com.book.recursion;

public class Arrays {

  private static boolean isArraySorted(int[] array, int index) {
    if (index == 1) {
      return true;
    } else {
      return array[index - 1] >= array[index - 2] && isArraySorted(array, index - 1);

    }
  }

  public static void main(String[] args) {
    System.out.println(isArraySorted(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
  }
}
