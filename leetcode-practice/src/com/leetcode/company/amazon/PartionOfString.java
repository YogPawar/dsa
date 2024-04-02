package com.leetcode.company.amazon;

import java.util.HashSet;
import java.util.Set;

public class PartionOfString {

  public static void main(String[] args) {
    String s = "hdklqkcssgxlvehva";

    System.out.println(partionString(s));
  }

  private static int partionStringTC(String s) {
    int count = 0;
    if (s.length() == 1) {
      return 1;
    }
    Set<Character> prepareWord = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      if (prepareWord.contains(s.charAt(i))) {
        //do nothing
        count++;
        prepareWord.clear();
        prepareWord.add(s.charAt(i));
      } else {
        prepareWord.add(s.charAt(i));
      }
    }

    return prepareWord.isEmpty() ? count : count + 1;
  }

  public static int partionString(String s) {
    int result = 1;
    int start = 0; //index
    HashSet<Character> setChar = new HashSet<>();
    while (start < s.length()) {
      if (!setChar.add(s.charAt(start))) {
        result += 1;
        setChar.clear();
        continue;
      }
      start += 1;
    }
    return result;
  }

  public static int partionStringJava8(String s) {
    Set<Character> setChar = new HashSet<>();
    return (int) s.chars().mapToObj(c -> (char) c)
        .filter(c -> !setChar.add(c))
        .peek(c -> {
          setChar.clear();
          setChar.add(c);
        }).count() + 1;
  }

}
