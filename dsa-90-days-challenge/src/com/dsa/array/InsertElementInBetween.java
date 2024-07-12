package com.dsa.array;

import java.util.Arrays;

public class InsertElementInBetween {

  private static int[] insert(int[] nums, int element, int index) {
    if (index > nums.length - 1) {
      System.out.println(" Error : Index not found");
      return null;
    } else {
      nums[index] = element;
    }
    return nums;
  }

  public static void main(String[] args) {
    System.out.println(
        "Case : {1,2,3,4,5} index = 2, element : 6  \n After Insertion :  " + Arrays.toString(
            insert(new int[]{1, 2, 3, 4, 5}, 6, 2)));

    System.out.println(
        "Case : {1,2,3,4,5} index = 5, element : 6  \n After Insertion :  " + Arrays.toString(
            insert(new int[]{1, 2, 3, 4, 5}, 6, 5)));
  }
}


