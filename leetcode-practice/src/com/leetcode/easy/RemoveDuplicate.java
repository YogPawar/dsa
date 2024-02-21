package com.leetcode.easy;

public class RemoveDuplicate {

  public static void main(String[] args) {
    int[] input = {1, 1, 2};
    // int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};  // 0,1,2,3,4

    System.out.println(removeDuplicate(input));
  }

  private static int removeDuplicate(int[] input) {
    int j = 1;
    for (int i = 1; i < input.length; i++) {
      if (input[i] != input[i - 1]) {
        input[j] = input[i];
        j++;
      }
    }
    return j;
  }

}
