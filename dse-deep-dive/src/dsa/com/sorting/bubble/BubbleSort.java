package dsa.com.sorting.bubble;

public class BubbleSort {

  public void bubbleSort(int[] unsortedArray) {
    if (unsortedArray.length == 1) {
      return;
    }

    for (int i = unsortedArray.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (unsortedArray[j] > unsortedArray[j + 1]) {
          swap(unsortedArray, j, j + 1);
        }
      }
    }

  }

  private void swap(int[] unsortedArray, int i, int j) {
    if (i == j) {
      return;
    }
    int temp = unsortedArray[i];
    unsortedArray[i] = unsortedArray[j];
    unsortedArray[j] = temp;
  }

}
