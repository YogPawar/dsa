package com.leetcode.array.eassy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(plusOne(new int[]{1,9,9})));
  }

  public static int[] plusOne(int[] input) {
    for (int i = input.length - 1; i >= 0; i--) {
      if (input[i] != 9) {
        input[i]++;
        return input;
      }
      input[i] = 0;
    }

    int[] result = new int[input.length + 1];
    result[0] = 1;
    return result;
  }

}