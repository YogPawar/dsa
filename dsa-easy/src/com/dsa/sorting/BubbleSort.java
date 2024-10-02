package com.dsa.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

  private static void sort(int[] numbers) {
    boolean swapIndext = true;
    for (int i = numbers.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (numbers[j] > numbers[i]) {
          swap(numbers, i, j);
        }
      }
    }
  }

  private static void swap(int[] numbers, int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = {3, 1, 54, 6, 2, 89, 3, 4, 5, 5};
    System.out.println("Before sorting : " + Arrays.toString(nums));
    sort(nums);
    System.out.println("After sorting :" + Arrays.toString(nums));
  }
}
