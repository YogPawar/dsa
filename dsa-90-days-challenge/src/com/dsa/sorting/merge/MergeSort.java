package com.dsa.sorting.merge;

import java.util.Arrays;

public class MergeSort {

  private static int[] mergeSort(int[] nums) {
    int midIndex = nums.length / 2;
    if (nums.length == 1) { //base case here array having only one element
      return nums;
    }
    int[] left = mergeSort(Arrays.copyOfRange(nums, 0, midIndex));
    int[] right = mergeSort(Arrays.copyOfRange(nums, midIndex, nums.length));
    return merge(left, right);
  }

  //helper method.
  private static int[] merge(int[] firstArray, int[] secondArray) {
    int[] sortedArray = new int[firstArray.length
        + secondArray.length]; //it will have the sorted array
    int i = 0; //starting index for first array
    int j = 0; //starting index for second array
    int c = 0; //index for sorted array array
    while (i < firstArray.length && j < secondArray.length) {
      if (firstArray[i] < secondArray[j]) {
        sortedArray[c] = firstArray[i];
        i++;
        c++;
      } else {
        sortedArray[c] = secondArray[j];
        j++;
        c++;
      }
    }

    while (j < secondArray.length) {
      sortedArray[c] = secondArray[j];
      c++;
      j++;
    }

    while (i < firstArray.length) {
      sortedArray[c] = firstArray[i];
      c++;
      i++;
    }
    return sortedArray;
  }

  public static void main(String[] args) {
    int[] firstArray = {2, 1, 3, 4, 8, 6, 5, 9, 7, 10};
    System.out.println(Arrays.toString(mergeSort(firstArray)));

  }

}
