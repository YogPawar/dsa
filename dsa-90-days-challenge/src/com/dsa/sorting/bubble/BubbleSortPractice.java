package com.dsa.sorting.bubble;

import java.util.Arrays;

public class BubbleSortPractice {

  private static void sort(int[] nums) {
    for (int i = nums.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (nums[i] < nums[j]) {
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {19, 3, 2, 7, 1, 9, 4};
    System.out.println("Before sorting : " + Arrays.toString(nums));
    sort(nums);
    System.out.println("After sorting : " + Arrays.toString(nums));
  }

}
