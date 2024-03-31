package com.leetcode.string;

public class CommonDivisorString {

  public static void main(String[] args) {
    System.out.println("TEST CASE 1 : ");
    System.out.println("Input 1 : ABCABC , 2: ABC");
    System.out.println("Output " + cdfs("ABCABC", "ABC"));
    System.out.println("========================================");
    System.out.println("TEST CASE 2 : ");
    System.out.println("Input 1 : ABABAB , 2: AB");
    System.out.println("Output " + cdfs("ABABABAB", "AB"));
    System.out.println("========================================");
    System.out.println("TEST CASE 3 : ");
    System.out.println("Input 1 : LEET , 2: CODE");
    System.out.println("Output " + cdfs("LEET", "CODE"));
    System.out.println("========================================");
  }

  private static String cdfs(String word1, String word2) {
    if (word2.length() > word1.length()) {
      return cdfs(word2, word1);
    }
    if (word2.equals(word1)) {
      return word1;
    }
    if (word1.startsWith(word2)) {
      return cdfs(word1.substring(word2.length()), word2);
    }
    return "";
  }
}
