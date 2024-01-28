package dsa.com.sorting.merge;

import java.util.Arrays;

/**
 * Performing the merge sort without creating the new array and working on existing array
 */
public class Merge {

  public static void main(String[] args) {

    int[] unSortedArray = {4, 6, 2, 1, 8, 43, 5};

    mergeSort(unSortedArray, 0, unSortedArray.length);
    System.out.println(Arrays.toString(unSortedArray));
  }


  public static void mergeSort(int[] array, int start, int end) {
    if (end - start < 2) {
      return;
    }

    int mid = (start + end) / 2;
    mergeSort(array, 0, mid); //left array
    mergeSort(array, mid, end); //right array
    merge(array, start, mid, end);

  }

  private static void merge(int[] array, int start, int mid, int end) {

    if (array[mid - 1] <= array[mid]) {
      return;
    }

    int i = start;
    int j = mid;
    int index = 0;
    int[] combined = new int[end - start];

    while (i < mid && j < end) {
      combined[index++] = array[i] <= array[j] ? array[i++] : array[j++];
    }
    System.arraycopy(array, i, array, start + index, mid - i);
    System.arraycopy(combined, 0, array, start, index);
  }

}
