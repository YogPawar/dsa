package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.spec.PSource;

public class TwoSum {

  public static void main(String[] args) {
    int[] input = {2, 7, 11, 15};
    int[] indexs = twoSum(input, 18);
    System.out.println(Arrays.toString(indexs));
  }

  private static int[] twoSum(int[] input, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] indices = new int[2];
    for (int i = 0; i < input.length; i++) {
      int calculate = target - input[i];
      if (map.containsKey(calculate)) {
        indices[0] = i;
        indices[1] = map.get(calculate);
        break;
      }
      map.put(input[i], i);
    }

    return indices;
  }
}
