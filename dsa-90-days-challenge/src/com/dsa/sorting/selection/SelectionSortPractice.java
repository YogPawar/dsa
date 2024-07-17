package com.dsa.sorting.selection;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SelectionSortPractice {


  public static void main(String[] args) {
    int[] nums = {19, 3, 2, 7, 1, 9, 4};
    System.out.println("Selection Sort : ");
    System.out.println("Before sorting : " + Arrays.toString(nums));
    sort(nums);
    System.out.println("After sorting : " + Arrays.toString(nums));
  }

  private static void sort(int[] nums) {
    //Select the one element as min and check that with others
    //if we found the min element then existing exchange them.
    for (int i = 0; i < nums.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[minIndex]) {
          minIndex = j;
        }
      }

      if (i != minIndex) {
        int temp = nums[minIndex];
        nums[minIndex] = nums[i];
        nums[i] = temp;
      }
    }

  }

}
