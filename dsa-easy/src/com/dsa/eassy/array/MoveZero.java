package com.dsa.eassy.array;

import java.util.Arrays;

/**
 * Leetcode : 283
 * Link : https://leetcode.com/problems/move-zeroes/description/
 */
public class MoveZero {


  //TC : O(N)
  //SC : O(N) --> to store temp array
  private static void moveZeroExtraPlace(int[] nums) {
    int i = 0;
    int k = 0;
    int size = nums.length;
    int[] temp = new int[size];
    while (i < size) {
      if (nums[i] != 0) {
        temp[k++] = nums[i];
      }
      i++;
    }
    System.out.println(Arrays.toString(temp));
  }


  public static void main(String[] args) {
    moveZeroExtraPlace(new int[]{0, 1, 0, 3, 12});
    moveZeroInPlace(new int[]{0, 0, 0, 3, 12});
  }

  private static void moveZeroInPlace(int[] nums) {
    int l = 0;
    int r = 0;

    while (r < nums.length) {
      if (nums[r] != 0) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
        l++;
      }
      r++;
    }
    System.out.println(Arrays.toString(nums));
  }

}
