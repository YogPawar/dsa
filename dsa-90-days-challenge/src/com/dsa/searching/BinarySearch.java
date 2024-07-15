package com.dsa.searching;

import java.util.Arrays;

public class BinarySearch {


  private static int binarySearch(int[] nums, int value) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (nums[mid] == value) {
        return mid;
      }
      if (nums[mid] < value) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    System.out.println(searchRoatedSortedArray(nums, 0));

    int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(
        "Sorted Array : " + Arrays.toString(sortedArray) + "\nSearch Element : " + 3);
    System.out.println("Value found at index : " + binarySearch(sortedArray, 3));
  }

  public static int searchRoatedSortedArray(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == target) {
        return mid;
      }
      if (nums[low] <= nums[mid]) {
        if (nums[low] <= target && target < nums[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        if (nums[mid] < target && target < nums[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return -1;
  }


}
