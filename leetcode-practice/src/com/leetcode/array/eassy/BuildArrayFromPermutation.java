package com.leetcode.array.eassy;

import java.util.Arrays;

public class BuildArrayFromPermutation {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(build(new int[]{1, 2, 3, 4, 0})));
  }

  private static int[] build(int[] ints) {
    int[] ans = new int[ints.length];
    for (int i = 0; i < ints.length; i++) {
      ans[i] = ints[ints[i]];
    }
    return ans;
  }

}
