package dsa.com.sorting.bubble.selection;

import java.util.Arrays;

public class RunSelectionSort {

  public static void main(String[] args) {
    int[] unsortedArray ={4,2,1,55,67,8};

    SelectionSort sl = new SelectionSort();
    sl.selectionSort(unsortedArray);
    System.out.println(Arrays.toString(unsortedArray));
  }

}
