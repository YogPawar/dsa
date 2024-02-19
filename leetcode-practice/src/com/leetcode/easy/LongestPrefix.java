package com.leetcode.easy;

import java.util.Arrays;

public class LongestPrefix {

  public static void main(String[] args) {
    String[] input = {"flower", "flow", "flight"};

    String longestPrefix = getLongestPrefix(input);
    System.out.println(longestPrefix);
  }

  private static String getLongestPrefix(String[] input) {
    StringBuilder longest = new StringBuilder();
    Arrays.sort(input);

    String first = input[0];
    String last = input[input.length - 1];

    for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
      if (first.charAt(i) != last.charAt(i)) {
        return longest.toString();
      } else {
        longest.append(first.charAt(i));
      }
    }
    return longest.toString();
  }

}
