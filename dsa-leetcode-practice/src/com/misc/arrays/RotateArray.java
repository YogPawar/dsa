package com.misc.arrays;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int[] input = {1, 2, 3, 4, 5, 6, 7};
    rotateArray(input, 3);
    System.out.println(Arrays.toString(input));
  }

  private static void rotateArray(int[] input, int k) {
    k = k % input.length;

    //Reverse the first array
    for (int start = 0, end = input.length - k - 1; start < end; start++, end--) {
      int temp = input[start];
      input[start] = input[end];
      input[end] = temp;
    }

    //Reverse Second Array
    for (int start = input.length - k, end = input.length - 1; start < end; start++, end--) {
      int temp = input[start];
      input[start] = input[end];
      input[end] = temp;
    }

    //Reverse all array
    for (int start = 0, end = input.length - 1; start < end; start++, end--) {
      int temp = input[start];
      input[start] = input[end];
      input[end] = temp;
    }
  }

}
