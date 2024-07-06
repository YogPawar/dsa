package com.leetcode.string.eassy;

import java.util.Arrays;
import java.util.HashMap;

public class ReverseOvals {

  private static String reverseOval(String str) {
    char[] ch = str.toCharArray(); // it is required because String is mutual and we need to change the vowels
    int start = 0;
    int end = str.length() - 1;
    String vowels = "aeiouAEIOU";
    while (start < end) {
      //move start pointer untils its find the vowel
      while (start < end && vowels.indexOf(ch[start]) == -1) {
        start++;
      }

      while (start < end && vowels.indexOf(ch[end]) == -1) {
        end--;
      }

      char temp = ch[end];
      ch[end] = ch[start];
      ch[start] = temp;

      start++;
      end--;
    }

    String ans = new String(ch);
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(reverseOval("Aa"));

  }

}
