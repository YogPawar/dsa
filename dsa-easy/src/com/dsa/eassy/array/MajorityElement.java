package com.dsa.eassy.array;

import java.util.Arrays;

/**
 * Leetcode no : 169 Link : https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {

  private static int majorityElement(int[] nums) {
    sort(nums, 0, nums.length - 1);
    System.out.println(Arrays.toString(nums));
    return nums[nums.length / 2];
  }

  private static void sort(int[] nums, int firstIndex, int lastIndex) {
    if (firstIndex < lastIndex) {
      int pivotIndex = pivotIndex(nums, firstIndex, lastIndex);
      sort(nums, firstIndex, pivotIndex - 1);
      sort(nums, pivotIndex + 1, lastIndex);
    }
  }

  private static int pivotIndex(int[] nums, int pivotIndex, int lastIndex) {
    int swapIndex = pivotIndex;
    //swap the element between swapindex and lastindex
    for (int i = pivotIndex + 1; i <= lastIndex; i++) {
      if (nums[i] < nums[pivotIndex]) {
        swapIndex++;
        swap(nums, i, swapIndex);
      }
    }
    swap(nums, pivotIndex, swapIndex);
    //swap the pivot index and swap index
    return swapIndex;
  }

  private static void swap(int[] nums, int i, int swapIndex) {
    int temp = nums[i];
    nums[i] = nums[swapIndex];
    nums[swapIndex] = temp;
  }

  public static void main(String[] args) {
    System.out.println(majorityElement(new int[]{3, 2, 3, 2, 4, 2, 2, 2, 2, 2}));
  }

}
