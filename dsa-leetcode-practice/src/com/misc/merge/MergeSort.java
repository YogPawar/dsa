package com.misc.merge;

import java.util.Arrays;

public class MergeSort {

  public static int[] merge(int[] first, int[] second) {
    int[] combined = new int[first.length + second.length];
    int index = 0;
    int i = 0;
    int j = 0;

    while (i < first.length && j < second.length) {
      if (first[i] < second[j]) {
        combined[index] = first[i];
        index++;
        i++;
      } else {
        combined[index] = second[j];
        j++;
        index++;
      }
    }

    while (i < first.length) {
      combined[index] = first[i];
      index++;
      i++;
    }

    while (j < second.length) {
      combined[index] = second[j];
      index++;
      j++;
    }
    return combined;
  }

  public static int[] mergeSort(int[] arrays) {
    if (arrays.length == 1) {
      return arrays;
    }
    int midIndex = arrays.length / 2;
    int[] left = mergeSort(Arrays.copyOfRange(arrays, 0, midIndex));
    int[] right = mergeSort(Arrays.copyOfRange(arrays, midIndex, arrays.length));
    return merge(left, right);
  }

  public static void main(String[] args) {
    int[] first = {2, 3, 5, 6};
    int[] second = {1, 4, 7, 9};
    System.out.println(Arrays.toString(merge(first, second)));

    System.out.println("Merge Sort : ");
    int[] array = {4, 6, 89, 2, 1, 5, 9};
    System.out.println(Arrays.toString(mergeSort(array)));
  }

}
