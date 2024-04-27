package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import javax.swing.plaf.IconUIResource;

public class CountPairs {

  public static void main(String[] args) {
    System.out.println(count(Arrays.asList(-1, 1, 2, 3, 1), 2));
  }

  private static int count(List<Integer> numbers, int target) {
    int count = 0;
    for (int i = 0; i < numbers.size(); i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
        int addtion = numbers.get(i) + numbers.get(j);
        count += (target > addtion) ? 1 : 0;
      }
    }
    return count;
  }


}
