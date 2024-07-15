package com.dsa.searching;

public class BinarySearch {

  private static int search(int[] nums, int value) {
    int startIndex = 0;
    int endIndex = nums.length - 1;
    while (startIndex <= endIndex) {
      int mid = startIndex + (endIndex - startIndex) / 2;
      if (nums[mid] == value) {
        return mid;
      }

      if (nums[mid] < value) {
        startIndex = mid + 1;
      } else {
        endIndex = mid - 1;
      }
    }
    return -1;
  }

  private static int binarySearch(int[] nums, int value) {
    int start = 0;
    int end = nums.length - 1;
    int midIndex = (start + end) / 2;
    while (nums[midIndex] != value) {
      if (value < nums[midIndex]) {
        end = midIndex - 1;
      } else {
        start = midIndex + 1;
      }
      midIndex = (start + end) / 2;
    }
    return midIndex;
  }

  public static void main(String[] args) {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    System.out.println(searchIndex(nums, 0));
  }

  public static int searchIndex(int[] nums, int target) {
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
