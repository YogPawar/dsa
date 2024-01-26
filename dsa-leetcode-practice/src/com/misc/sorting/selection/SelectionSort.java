package com.misc.sorting.selection;

import java.util.Arrays;

public class SelectionSort {

  public static void sort(int[] input) {
    for (int i = 0; i < input.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < input.length; j++) {
        if (input[j] < input[minIndex]) {
          minIndex = input[j];
        }
      }

      if (i != minIndex) {
        swap(input, i, minIndex);
      }
    }
  }

  private static void swap(int[] input, int i, int minIndex) {
    int temp = input[i];
    input[i] = input[minIndex];
    input[minIndex] = temp;
  }

  public static void main(String[] args) {
    int[] input = {3, 5, 1, 2, 7};
    sort(input);
    System.out.println(Arrays.toString(input));
  }

}
