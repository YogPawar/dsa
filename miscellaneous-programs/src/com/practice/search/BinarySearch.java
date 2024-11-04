package com.practice.search;

import org.w3c.dom.ls.LSOutput;

public class BinarySearch {

  private static int search(int[] numbers, int data) {
    return search(numbers, data, 0, numbers.length - 1);
  }

  private static int search(int[] numbers, int data, int leftIndex, int rightIndex) {
    //base case
    if (leftIndex > rightIndex) {
      return -1;
    }
    int mid = leftIndex + (rightIndex - leftIndex) / 2;
    if (numbers[mid] == data) {
      return mid;
    } else if (numbers[mid] < data) {
      return search(numbers, data, mid + 1, rightIndex);
    } else {
      return search(numbers, data, leftIndex, mid - 1);
    }
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(search(numbers, 7));
  }
}
