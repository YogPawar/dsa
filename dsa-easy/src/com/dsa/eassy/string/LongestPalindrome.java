package com.dsa.eassy.string;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

  /**
   * Approach 1<p> Time complexity: O(n), where n is the length of the string. Space complexity:
   * O(k), where k is the number of unique characters (typically O(1) for ASCII).
   *
   * @param s
   * @return
   */
  private static int longestPalindrome(String s) {
    int length = 0;
    boolean addOne = false;
    HashMap<Character, Integer> charCounterMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (charCounterMap.containsKey(ch)) {
        charCounterMap.put(ch, charCounterMap.get(ch) + 1);
      } else {
        charCounterMap.put(ch, 1);
      }
    }

    for (int counter : charCounterMap.values()) {
      if (counter % 2 == 0) {
        length += counter;
      } else {
        length += counter - 1;
        addOne = true;
      }
    }

    return (addOne) ? length + 1 : length;
  }

  public static void main(String[] args) {
    System.out.println(longestPalindrome("ababababa"));
    System.out.println(longestPalindromeUsingArray("ababababa"));



  }


  private static int longestPalindromeUsingArray(String s) {
    int[] counter = new int[128]; //Assuming ASCII character.
    int length = 0;
    for (char c : s.toCharArray()) {
      if (++counter[c] == 2) {
        length += 2;
        counter[c] = 0;
      }
    }
    return length < s.length() ? length + 1 : length;
  }
}
