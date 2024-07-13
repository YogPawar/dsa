package com.dsa.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {

  private static int[] sort(int[] nums) {
    //in insertion sort we start from 1st index and do compare it with left values.
    for (int i = 1; i < nums.length; i++) {
      int temp = nums[i]; //sotored the 1st element into temp for comparison
      int j = i - 1; // j will start from previous index of i
      while (j > -1 && nums[j] > temp) { //swap j with j + 1;
        nums[j + 1] = nums[j];
        nums[j] = temp;
        j--; //decrement the j to compare with all left side elements
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[]{4, 1, 6, 8, 9, 10, 3, 2})));
  }

}
