package dsa.com.sorting.inseration;

import java.util.Arrays;

public class InsertionSort {

  public static void sort(int[] array) {

    for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
      int newElement = array[unsortedIndex];
      int i;
      for (i = unsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
        array[i] = array[i - 1];
      }
      array[i] = newElement;
    }

  }

  public static void main(String[] args) {

    int[] array = {5, 2, 7, 1, 3, 9, 4};
    sort(array);
    System.out.println(Arrays.toString(array));

  }

}
