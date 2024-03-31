package com.leetcode.string;

import java.sql.SQLOutput;

public class MergeStringAlternately {

  public static void main(String[] args) {
    System.out.println("TEST CASE 1 : ");
    System.out.println("Input 1 : abc , 2: pqr");
    System.out.println("Output " + mergeString("abc", "pqr"));
    System.out.println("========================================");
    System.out.println("TEST CASE 2 : ");
    System.out.println("Input 1 : ab , 2: pqrs");
    System.out.println("Output " + mergeString("ab", "pqrs"));
    System.out.println("========================================");
    System.out.println("TEST CASE 3 : ");
    System.out.println("Input 1 : abcd , 2: pq");
    System.out.println("Output " + mergeString("abcd", "pq"));
    System.out.println("========================================");
  }

  private static String mergeString(String word1, String word2) {
    StringBuilder result = new StringBuilder();
    int index = 0;
    while (index < word1.length() || index < word2.length()) {
      if (index < word1.length()) {
        result.append(word1.charAt(index));
      }
      if (index < word2.length()) {
        result.append(word2.charAt(index));
      }
      index += 1;
    }
    return result.toString();
  }

}
