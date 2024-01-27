package com.misc.arrays;

import java.util.Arrays;

public class MinMaxElement {


  public static void main(String[] args) {
    int[] myList1 = {5, 3, 8, 1, 6, 9};
    int[] result1 = findMaxMin(myList1);
    System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"

    int[] myList2 = {-5, -3, -8, -1, -6, -9};
    int[] result2 = findMaxMin(myList2);
    System.out.println("Test case 2: MaxMin: " + Arrays.toString(result2)); // prints "[-1, -9]"

    int[] myList3 = {0, 0, 0, 0, 0};
    int[] result3 = findMaxMin(myList3);
    System.out.println("Test case 3: MaxMin: " + Arrays.toString(result3)); // prints "[0, 0]"

    int[] myList4 = {100, 200, 300, 400, 500};
    int[] result4 = findMaxMin(myList4);
    System.out.println("Test case 4: MaxMin: " + Arrays.toString(result4)); // prints "[500, 100]"
  }

  private static int[] findMaxMin(int[] input) {

    int min = input[0];
    int max = input[0];

    for (int elemet : input) {
      if (elemet < min) {
        min = elemet;
      }
      if (elemet > max) {
        max = elemet;
      }
    }
    return new int[]{max, min};
  }

}
