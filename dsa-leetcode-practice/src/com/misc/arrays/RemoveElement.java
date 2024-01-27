package com.misc.arrays;

import java.util.Arrays;

public class RemoveElement {


  public static void main(String[] args) {
    // Test case 1
    int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int val1 = 1;
    int newLength1 = removeElement(nums1, val1);
    System.out.println("Original Array : " + Arrays.toString(nums1));

    System.out.println("Test case 1: Modified array: " +
        Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)) +
        "\nNew length: " + newLength1);


  }

  public static int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }


}
