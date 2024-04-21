package com.leetcode.array.eassy;

import java.util.Arrays;

public class ShuffleArray {

  public static void main(String[] args) {

    System.out.println(Arrays.toString(shuffle(new int[]{1, 2, 3, 1, 2, 3}, 3)));
  }

  public static int[] shuffle(int[] nums, int n) {
    int first = 0;
    int second = n;
    int index = 0;
    int[] result = new int[nums.length];
    while (index < nums.length) {
      result[index] = nums[first];
      index++;
      result[index] = nums[second];
      first++;
      second++;
      index++;
    }
    return result;
  }


}
