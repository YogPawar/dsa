package com.leetcode.easy;

import java.util.HashMap;

public class RomanToInteger {

  public static void main(String[] args) {
    String s = "I";
    int value = romanToInteger(s);
    System.out.println("Test CASE 1 Expected : " + 1);
    System.out.println("Test CASE 1 Actual : " + value);

    value = romanToInteger(s);
    System.out.println("Test CASE 1 Expected : " + 1);
    System.out.println("Test CASE 1 Actual : " + value);

    value = romanToInteger("IV");
    System.out.println("Test CASE 2 Expected : " + 4);
    System.out.println("Test CASE 2 Actual : " + value);

    value = romanToInteger("VI");
    System.out.println("Test CASE 3 Expected : " + 6);
    System.out.println("Test CASE 3 Actual : " + value);

    value = romanToInteger("DM");
    System.out.println("Test CASE 4 Expected : " + 500);
    System.out.println("Test CASE 4 Actual : " + value);

    value = romanToInteger("MD");
    System.out.println("Test CASE 5 Expected : " + 1100);
    System.out.println("Test CASE 5 Actual : " + value);

    value = romanToInteger("XII");
    System.out.println("Test CASE 6 Expected : " + 12);
    System.out.println("Test CASE 6 Actual : " + value);

    value = romanToInteger("LVIII");
    System.out.println("Test CASE 7 Expected : " + 58);
    System.out.println("Test CASE 7 Actual : " + value);
  }

  private static int romanToInteger(String s) {
    int answer = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    for (int i = 0; i < s.length(); i++) {
      if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
        answer -= map.get(s.charAt(i));
      } else {
        answer += map.get(s.charAt(i));
      }
    }
    return answer;
  }

}
