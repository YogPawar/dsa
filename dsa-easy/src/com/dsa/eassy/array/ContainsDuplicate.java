package com.dsa.eassy.array;

import java.util.HashSet;

/**
 * Leetcode : 217 Link : https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

  private static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> numSet = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (numSet.contains(nums[i])) {
        return true;
      } else {
        numSet.add(nums[i]);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 6}));
  }

}
