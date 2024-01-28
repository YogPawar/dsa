package dsa.com.sorting.selection;

public class SelectionSort {

  public void selectionSort(int[] unsortedArray) {
    for (int unsortedIndex = unsortedArray.length - 1; unsortedIndex > 0; unsortedIndex--) {
      int largeIndex = 0;
      for (int i = 1; i <= unsortedIndex; i++) {
        if (unsortedArray[i] > unsortedArray[largeIndex]) {
          largeIndex = i;
        }
      }
      swap(unsortedArray, largeIndex, unsortedIndex);
    }
  }

  public void swap(int[] unsortedArray, int i, int j) {
    if (i == j) {
      return;
    }
    int temp = unsortedArray[i];
    unsortedArray[i] = unsortedArray[j];
    unsortedArray[j] = temp;
  }

}
