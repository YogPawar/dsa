package com.dsa.eassy.string;

import java.util.Arrays;

public class AnagramString {

  private static boolean isAnargam(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    char[] first = s1.toCharArray();
    char[] second = s2.toCharArray();
    Arrays.sort(first);
    Arrays.sort(second);
    int i = 0;
    while (i < s1.length()) {
      if (first[i] != second[i]) {
        return false;
      }
      i++;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isAnargam("anagram", "nagaram"));
  }
}
