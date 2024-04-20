package com.leetcode.array.eassy;

import java.util.Arrays;

public class PairCounter {

  public static void main(String[] args) {
    int pairCounter = pair(new int[]{1, 2, 3, 1, 1, 3});
    System.out.println(pairCounter);
  }

  private static int pairCount(int[] ints) {
    int pairCounter = 0;
    for (int i = 0; i < ints.length; i++) {
      for (int j = i + 1; j < ints.length; j++) {
        if (ints[i] == ints[j]) {
          pairCounter += 1;
        }
      }
    }
    return pairCounter;
  }//TC : O(n^2)

  //do it in o(n)
  public static int pair(int[] nums) {
    int ans = 0;
    int[] freq = new int[nums.length * nums.length];
    for (int x = 0; x < nums.length; x++) {
      ans += freq[nums[x]];
      freq[nums[x]]++;
    }
    return ans;
  }//TC : O(N)
}
