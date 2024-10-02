package com.dsa.eassy.array;

import java.util.Arrays;

/**
 * Leetcode : 977 Link : https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
public class SquaresOfSortedArray {

  private static void sortedSquare(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = getSequare(nums[i]);
    }
    //sort the array
    int left = 0;
    System.out.println("Before sorting : \n" + Arrays.toString(nums));
    for (int right = nums.length - 1; right > 0; right--) {
      if (nums[left] > nums[right]) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
      }
    }
    System.out.println("After sorting : " + Arrays.toString(nums));
  }

  private static int getSequare(int num) {
    return num * num;
  }

  public static void main(String[] args) {
    sortedSquare(new int[]{4, -1, 0, 3, 10});

  }

}
