package com.dsa.sorting.insertion;

import java.util.Arrays;

public class InsertionSortPractice {

  private static void sort(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      int temp = nums[i];
      int j = i - 1;
      while (j > -1 && nums[j] > temp) {
        nums[j + 1] = nums[j];
        nums[j] = temp;
        j--;
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
