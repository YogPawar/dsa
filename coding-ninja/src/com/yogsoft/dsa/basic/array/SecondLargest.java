package com.yogsoft.dsa.basic.array;

public class SecondLargest {

  private static int secondLargest(int n, int[] arr) {
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      firstLargest = Math.max(firstLargest, arr[i]);
    }
    for (int i = 0; i < n; i++) {
      if (arr[i] != firstLargest) {
        secondLargest = Math.max(secondLargest, arr[i]);
      }
    }
    return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
  }

  public static void main(String[] args) {
    System.out.println(secondLargest(6, new int[]{-10, -40, -25, -25, -12, -10}));
    System.out.println(findSecondLargest(6, new int[]{-10, -40, -25, -25, -12, -10}));
    // System.out.println(secondLargest(5, new int[]{-12, -10, -10, -6, -5}));
  }

  public static int findSecondLargest(int n, int[] arr) {
    // Write your code here.
    int firstLargest = 0;
    for (int i = 0; i < n; i++) {
      firstLargest = Math.max(firstLargest, arr[i]);
    }

    int secondLargest = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] != firstLargest) {
        secondLargest = Math.max(secondLargest, arr[i]);
      }
    }
    return secondLargest;
  }
}
