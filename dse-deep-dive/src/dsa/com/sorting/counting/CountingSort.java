package dsa.com.sorting.counting;

import java.util.Arrays;

public class CountingSort {

  public static void main(String[] args) {
    int[] inArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

    countingSort(inArray, 1, 10);

    System.out.println(Arrays.toString(inArray));
  }

  public static void countingSort(int[] input, int min, int max) {
    int[] countingArray = new int[(max - min) + 1];
    for (int i = 0; i < input.length; i++) {
      countingArray[input[i] - min]++;
    }
    int j = 0;
    for (int i = min; i <= max; i++) {
      while (countingArray[i - min] > 0) {
        input[j++] = i;
        countingArray[i - min]--;
      }
    }
  }
}
