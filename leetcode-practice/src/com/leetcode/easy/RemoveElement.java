package com.leetcode.easy;

public class RemoveElement {

  private static int removeDuplicate(int[] input, int val) {
    int j = 0;
    for (int i = 0; i < input.length; i++) {
      if (input[i] != val) {
        input[j] = input[i];
        j++;
      }
    }
    return j;
  }

  public static void main(String[] args) {

    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    System.out.println(removeDuplicate(nums, 2));
  }
}
