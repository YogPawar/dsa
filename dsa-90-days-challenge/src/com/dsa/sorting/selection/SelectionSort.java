package com.dsa.sorting.selection;

import java.util.Arrays;

public class SelectionSort {

  private static int[] sort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int minIndex = i; //considering the i is minimum element
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[minIndex]
            > nums[j]) { // if nums[j] is smaller than value at minIndex then set minIndex to j
          minIndex = j;
        }
      }
      int temp = nums[minIndex];
      nums[minIndex] = nums[i];
      nums[i] = temp;

    }
    return nums;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[]{3, 5, 6, 2, 1, 8, 91, 100})));
  }
}
