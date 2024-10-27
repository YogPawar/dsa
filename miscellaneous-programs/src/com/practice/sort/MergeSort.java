package com.practice.sort;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] nums = {4, 3, 1, 2, 10, 8, 54};

    System.out.println(Arrays.toString(mergeSort(nums)));
  }


  private static int[] mergeSort(int[] nums) {
    if (nums.length == 1) {
      return nums;
    }
    int midIndex = nums.length / 2;
    int[] left = mergeSort(Arrays.copyOfRange(nums, 0, midIndex));
    int[] right = mergeSort(Arrays.copyOfRange(nums, midIndex, nums.length));
    return merge(left, right);
  }

  private static int[] merge(int[] left, int[] right) {
    int[] sortedArray = new int[left.length + right.length];
    int index = 0;
    int leftIndex = 0;
    int rightIndex = 0;
    while (leftIndex < left.length && rightIndex < right.length) {

    }
    return null;
  }

}
