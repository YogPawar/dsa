package com.leetcode.array.eassy;

import java.lang.ref.PhantomReference;
import java.util.HashMap;

public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(romanToInt("MCMXCIV"));
  }

  private static int romanToInt(String s) {
    HashMap<Character, Integer> constants = new HashMap<>();
    constants.put('I', 1);
    constants.put('V', 5);
    constants.put('X', 10);
    constants.put('L', 50);
    constants.put('C', 100);
    constants.put('D', 500);
    constants.put('M', 1000);

    int answer = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i < s.length() - 1 && constants.get(s.charAt(i)) < constants.get(s.charAt(i + 1))) {
        answer -= constants.get(s.charAt(i));
      } else {
        answer += constants.get(s.charAt(i));
      }
    }
    return answer;
  }

}
