package com.leetcode.array.eassy;

import java.util.Arrays;

public class TheMajorityElement {

  public static int majorityElement(int[] nums) {
    Arrays.sort(nums); //-----------> O(n)
    int n = nums.length / 2; //-----> O(log n)
    return nums[n];
  } //TC O(n log n)

  public static void main(String[] args) {
    int major = majorityElement(new int[]{1, 3, 2, 4, 4, 4, 4, 4});
    System.out.println(major);
  }

}
