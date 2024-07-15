package com.dsa.sorting.selection;

import java.util.Arrays;

public class SelectionSort {

  private static void sort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int minIndex = i; //considering the i is minimum element
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[minIndex] > nums[j]) { // if nums[j] is smaller than value at minIndex then set minIndex to j
          minIndex = j;
        }
      }
      if (i != minIndex) {
        //if i and midIndex is same then it is already sorted no need to swap the element
        int temp = nums[minIndex];
        nums[minIndex] = nums[i];
        nums[i] = temp;
      }

    }
  }

  public static void main(String[] args) {
    int[] nums = {3, 5, 6, 2, 1, 8, 91, 100};
    System.out.println("Before sort : " + Arrays.toString(nums));
    sort(nums);
    System.out.println("After sort : " + Arrays.toString(nums));
  }
}
