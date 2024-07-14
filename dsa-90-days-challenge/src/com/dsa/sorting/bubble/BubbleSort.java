package com.dsa.sorting.bubble;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

  private static void sort(int[] nums) {
    //Traverse from end to start so every iteration value at last index will be sorted.
    for (int i = nums.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (nums[i] < nums[j]) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {6, 4, 5, 3, 1, 9};
    System.out.println("Before sort : " + Arrays.toString(nums));

    sort(nums);
    System.out.println("After sort : " + Arrays.toString(nums));
  }
}
