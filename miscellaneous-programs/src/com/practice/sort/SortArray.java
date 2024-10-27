package com.practice.sort;

public class SortArray {

  private static void sortArray(int[] nums) {
    int low = 0, mid = 0, high = nums.length - 1;
    while (mid <= high) {
      switch (nums[mid]) {
        case 0:
          swap(nums, low, mid);
          low++;
          mid++;
          break;
        case 1:
          mid++;
          break;
        case 2:
          swap(nums, mid, high);
          high--;
          break;
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] myArray = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    sortArray(myArray);

    // Print the sorted array
    for (int num : myArray) {
      System.out.print(num + " ");
    }
  }
}
