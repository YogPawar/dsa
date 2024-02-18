package com.misc.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {

  public static void sort(int[] input) {
    for (int i = input.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        swap(input, j, j + 1);
      }
    }
  }

  public static void swap(int[] input, int i, int j) {
    if (input[i] > input[j]) {
      int temp = input[i];
      input[i] = input[j];
      input[j] = temp;
    }
  }

  public static void swapOptimize(int[] input, int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }

  public static void main(String[] args) {
    int[] input = {4, 6, 2, 1, 8, 3};
    int[] input1 = {1, 2, 3, 4, 5, 6};
    bubbleSort(input1);
    System.out.print(Arrays.toString(input1));
  }

  public static void bubbleSort(int[] input) {
    int n = input.length - 1;
    for (int i = 0; i < n; i++) {
      boolean swap = false;
      for (int j = 0; j < n - i; j++) {
        if (input[j] > input[j + 1]) {
          swap = true;
          optimizeSwap(input, j);
        }
      }
      if (!swap) {
        System.out.println("Array is already sorted");
        break;
      }
    }
  }

  private static void optimizeSwap(int[] input, int j) {
    int temp = input[j];
    input[j] = input[j + 1];
    input[j + 1] = temp;
  }
}

