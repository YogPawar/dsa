package com.misc.quicksort;

import java.util.Arrays;

public class QuickSort {

  public static void swap(int[] array, int firstIndex, int secondIndex) {
    int temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
  }

  public static int pivot(int[] array, int piovtIndex, int endIndex) {
    int swapIndex = piovtIndex;
    for (int i = piovtIndex + 1; i <= endIndex; i++) {
      if (array[i] < array[piovtIndex]) {
        swapIndex++;  //swapIndex = i;
        swap(array, swapIndex, i);
      }
    }
    swap(array, piovtIndex, swapIndex);
    return swapIndex;
  }

  public static void quickSortHelper(int[] array, int left, int right) {
    if (left < right) {
      int pivotIndex = pivot(array, left, right);
      quickSortHelper(array, left, pivotIndex - 1);
      quickSortHelper(array, pivotIndex + 1, right);
    }
  }

  public static void quickSort(int[] array) {
    quickSortHelper(array, 0, array.length - 1);
  }


  public static void main(String[] args) {
    int[] myArray = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

    quickSort(myArray);

    System.out.println(Arrays.toString(myArray));
  }

}
