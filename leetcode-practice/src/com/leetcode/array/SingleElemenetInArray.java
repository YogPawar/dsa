package com.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleElemenetInArray {

  public static int signleElement(int[] nums) {
    Set<Integer> singleElement = new HashSet<>();
    for (int i : nums) {
      if (singleElement.contains(i)) {
        singleElement.remove(i);
      } else {
        singleElement.add(i);
      }
    }
    for (int i : singleElement) {
      return i;
    }
    return 0;
  }
  //sc: O(n) tc: o(n)

  public static void main(String[] args) {
    int[] input = {11, 22, 1, 22, 11};

    System.out.println(singleElementApproach2(input));
  }


  public static int singleElementApproach2(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i += 2) {
      if (nums[i] != nums[i - 1]) {
        return nums[i - 1];
      }
    }
    return nums[nums.length - 1];
  }

  //SC : O(1) tc: O(NlogN)
}
