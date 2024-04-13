package com.leetcode.string;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.plaf.ProgressBarUI;

public class LongestSubString {

  public static void main(String[] args) {
    System.out.println(longLenghtOfSubstring("abcdeaa"));
  }

  private static int longLenghtOfSubstring(String s) {
    int maxLength = Integer.MIN_VALUE;
    int leftIndex = 0;
    Map<Character, Integer> mapIndex = new HashMap<>();
    for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
      char c = s.charAt(rightIndex);
      if (mapIndex.containsKey(c)) {
        leftIndex = Math.max(leftIndex, mapIndex.get(c));
      }
      mapIndex.put(c, rightIndex + 1);
      maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
    }
    return maxLength;
  }
}
