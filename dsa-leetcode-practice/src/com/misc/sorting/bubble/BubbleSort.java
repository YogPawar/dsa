package com.misc.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {

  public static void sort(int[] input) {
    for (int i = input.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        swap(input, j, j + 1);
      }
    }
  }

  public static void swap(int[] input, int i, int j) {
    if (input[i] > input[j]) {
      int temp = input[i];
      input[i] = input[j];
      input[j] = temp;
    }
  }

  public static void main(String[] args) {
    int[] input = {4, 6, 2, 1, 8, 3};
    sort(input);
    System.out.print(Arrays.toString(input));
  }
}

