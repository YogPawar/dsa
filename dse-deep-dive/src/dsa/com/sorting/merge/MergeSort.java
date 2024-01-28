package dsa.com.sorting.merge;

import java.util.Arrays;

public class MergeSort {

  public static int[] merge(int[] left, int[] right) {
    int[] combined = new int[left.length + right.length];
    int i = 0;
    int j = 0;
    int index = 0;

    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        combined[index] = left[i];
        index++;
        i++;
      } else {
        combined[index] = right[j];
        index++;
        j++;
      }
    }

    while (i < left.length) {
      combined[index] = left[i];
      index++;
      i++;
    }
    while (j < right.length) {
      combined[index] = right[j];
      index++;
      j++;
    }
    return combined;
  }

  public static int[] mergeSort(int[] array) {
    if (array.length == 1) {
      return array;
    }
    int midIndex = array.length / 2;
    int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
    int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
    return merge(left, right);
  }

  public static void main(String[] args) {
    int[] left = {1, 2, 3};
    int[] right = {4, 5, 6};
    System.out.println(Arrays.toString(merge(left, right)));

    int[] unSortedArray = {4, 6, 2, 1, 8, 43, 5};

    System.out.println(Arrays.toString(mergeSort(unSortedArray)));
  }

}
