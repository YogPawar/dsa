package com.misc.sorting.inseraition;

import java.util.Arrays;

public class InserationSort {

  public static void sort(int[] input) {
    for (int i = 1; i < input.length; i++) {
      int temp = input[i];
      int j = i - 1;

      while (j > -1 && temp < input[j]) {
        input[j + 1] = input[j];
        input[j] = temp;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int[] input = {4, 6, 2, 1, 8, 4};
    sort(input);
    System.out.println(Arrays.toString(input));
  }

}
