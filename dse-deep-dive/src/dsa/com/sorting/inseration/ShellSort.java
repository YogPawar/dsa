package dsa.com.sorting.inseration;

import dsa.com.array.Array;
import java.util.Arrays;

public class ShellSort {

  public static void shellSort(int[] array) {
    for (int gap = array.length / 2; gap > 0; gap /= 2) { //gap = 3;
      for (int i = gap; i < array.length; i++) {
        int newElemet = array[i];
        int j = i;
        while (j >= gap && array[j - gap] > newElemet) {
          array[j] = array[j - gap];
          j -= gap;
        }
        array[j] = newElemet;
      }
    }
  }

  public static void main(String[] args) {
    int[] array = {3, 43, 6, -22, 7, 89, 11, 1};
    shellSort(array);
    System.out.println(Arrays.toString(array));

  }

}
