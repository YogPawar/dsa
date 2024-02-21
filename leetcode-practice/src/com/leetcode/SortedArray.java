package com.leetcode;

import java.util.Arrays;

public class SortedArray {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int index = 0;
    int i = 0;
    int j = 0;
    while (i < nums1.length && j < nums2.length) {

      if (nums1[i] < nums2[j]) {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
        i++;
        j++;

      } else {
        int temp = nums2[j];
        nums2[j] = nums1[i];
        nums2[i] = temp;
        j++;
        i++;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    merge(nums1, 6, nums2, 3);
    System.out.println(Arrays.toString(nums1));
  }

}
