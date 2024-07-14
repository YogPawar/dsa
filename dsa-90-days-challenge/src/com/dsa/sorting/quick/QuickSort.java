package com.dsa.sorting.quick;

import java.util.Arrays;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class QuickSort {

  //1. swap element
  private static void swap(int[] nums, int firstPosition, int secondPosition) {
    int temp = nums[firstPosition];
    nums[firstPosition] = nums[secondPosition];
    nums[secondPosition] = temp;
  }

  //2. Get the pivot index
  private static int pivot(int[] nums, int pivotIndex, int endIndex) {
    int swapIndex = pivotIndex;
    for (int i = pivotIndex + 1; i <= endIndex; i++) {
      if (nums[i] < nums[pivotIndex]) {
        swapIndex++;
        swap(nums, swapIndex, i);
      }
    }
    swap(nums, pivotIndex, swapIndex);
    return swapIndex;
  }

  //3. Quicksort helper
  private static void quickSortHelper(int[] nums, int leftIndex, int rightIndex) {
    if (leftIndex < rightIndex) {
      int pivotIdex = pivot(nums, leftIndex, rightIndex);
      quickSortHelper(nums, leftIndex, pivotIdex - 1);
      quickSortHelper(nums, pivotIdex + 1, rightIndex);
    }
  }

  //4. Quick Sort
  private static void sort(int[] nums) {
    quickSortHelper(nums, 0, nums.length - 1);
  }

  public static void main(String[] args) {
    int[] numbers = {4, 6, 1, 7, 3, 2, 5};
    System.out.println("Before sort : " + Arrays.toString(numbers));
    System.out.println();
    sort(numbers);
    System.out.println("After sort : " + Arrays.toString(numbers));
  }
}
