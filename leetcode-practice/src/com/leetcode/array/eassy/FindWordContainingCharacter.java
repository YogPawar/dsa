package com.leetcode.array.eassy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FindWordContainingCharacter {

  public static void main(String[] args) {

    System.out.println(findChar(new String[]{"leet", "code"}, 'e'));

  }

  private static List<Integer> findChar(String[] words, char ch) {
    List<Integer> characters = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      int result = words[i].indexOf(ch);
      if (result >= 0) {
        characters.add(i);
      }
    }
    return characters;
  }

}
