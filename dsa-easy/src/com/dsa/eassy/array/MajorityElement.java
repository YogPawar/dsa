package com.dsa.eassy.array;

import java.util.Arrays;

public class MajorityElement {

  private static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

  public static void main(String[] args) {
    System.out.println(majorityElement(new int[]{3, 2, 3}));
  }

}
