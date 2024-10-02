package com.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

  private static void sort(int[] numbers) {
    quickSort(numbers, 0, numbers.length - 1);
  }

  private static void quickSort(int[] numbers, int leftIndex, int rightIndex) {
    if (leftIndex < rightIndex) { //base case to break the recursion
      int pivotIndex = getPivotIndex(numbers, leftIndex, rightIndex);
      //sort left from pivot index
      quickSort(numbers, leftIndex, pivotIndex - 1);
      //sort right array from the pivot index
      quickSort(numbers, pivotIndex + 1, rightIndex);
    }
  }

  private static int getPivotIndex(int[] numbers, int pivotIndex, int rightIndex) {
    int swapIndex = pivotIndex;
    for (int i = pivotIndex + 1; i <= rightIndex; i++) {
      if (numbers[i] < numbers[pivotIndex]) {
        swapIndex++;
        swap(numbers, i, swapIndex);
      }
    }
    swap(numbers, pivotIndex, swapIndex);
    return swapIndex;
  }

  private static void swap(int[] numbers, int i, int swapIndex) {
    int temp = numbers[i];
    numbers[i] = numbers[swapIndex];
    numbers[swapIndex] = temp;
  }

  public static void main(String[] args) {
    int[] numbers = {4, 1, 6, 2, 9, 3, 11, 35, 25, 68};
    System.out.println("Before sorting : " + Arrays.toString(numbers));
    sort(numbers);
    System.out.println("After sorting :" + Arrays.toString(numbers));
  }

}
