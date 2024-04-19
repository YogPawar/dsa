package com.leetcode.array.eassy;

import java.util.Arrays;

public class ConcatnationOfArray {

  public static void main(String[] args) {
    int[] input = {1, 2, 1};
    System.out.println(Arrays.toString(concate(input)));

    int[] input2 = {1, 3, 1, 4, 5, 1};
    System.out.println(Arrays.toString(concate(input2)));

  }

  public static int[] concate(int[] nums) {
    int newLength = nums.length * 2;
    int[] ans = new int[newLength];
    int i = 0; //iterate the nums
    int j = 0; //insert into ans
    while (j < newLength) {
      ans[j] = nums[i];
      i++;
      j++;
      if (i > nums.length - 1) {
        i = 0;
      }
    }

    return ans;
  }

}
