package com.dsa.eassy.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Leetcode : 1 Link : https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

  private static int[] twoSum(int target, int[] nums) {
    HashMap<Integer, Integer> numbers = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (numbers.containsKey(diff)) {
        return new int[]{numbers.get(diff), i};
      } else {
        numbers.put(nums[i], i);
      }
    }
    return new int[]{};
  } //TC : O(N) SC : O(N) --> for new hashMap

  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(5, new int[]{7, 2, 3, 6, 5, 8})));
  }
}
