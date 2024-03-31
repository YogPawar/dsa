package com.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidWithGreatesNumberCandies {

  public static void main(String[] args) {
    int[] candies = {4, 2, 1, 1, 2};
    int extraCandies = 1;
    List<Boolean> result = optimalSolution(candies, extraCandies);
    System.out.println(result);
  }

  /**
   * TC O(n^2);
   *
   * @param candies
   * @param extraCandies
   * @return
   */
  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();
    for (int i = 0; i < candies.length; i++) {
      boolean greates = false;
      for (int j = 0; j < candies.length; j++) {
        if (candies[i] + extraCandies < candies[j]) {
          greates = false;
          break;
        } else {
          greates = true;
        }
      }
      result.add(greates);
    }
    return result;
  }

  public static List<Boolean> optimalSolution(int[] candies, int extraCandi) {
    int max = 0;
    for (int candy : candies) {
      max = Math.max(max, candy);
    }

    List<Boolean> result = new ArrayList<>();
    for (int candy : candies) {
      result.add(max <= candy + extraCandi);
    }
    return result;
  }
}
