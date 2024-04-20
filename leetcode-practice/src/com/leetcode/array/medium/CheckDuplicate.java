package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicate {

  public static void main(String[] args) {
    System.out.println(findDup(new int[]{11, 22, 33, 44, 55, 44}));
  }

  //This logic will work if and only if array element is less than length of array
  public static List<Integer> findDuplicate(int[] nums) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int index = Math.abs(nums[i]) - 1; //give previous index
      if (nums[index] < 0) { //if it is grater than 0 then add
        result.add(index + 1); //1 + 1;
      }
      nums[index] = nums[index] * -1;
    }
    return result;
  }

  public static List<Integer> findDup(int[] input) {
    Set<Integer> duplicateElement = new HashSet<>();
    List<Integer> dupElement = new ArrayList<>();
    for (int i : input) {
      if (!duplicateElement.add(i)) {
        dupElement.add(i);
      } else {
        duplicateElement.add(i);
      }
    }
    return dupElement;
  }

}
