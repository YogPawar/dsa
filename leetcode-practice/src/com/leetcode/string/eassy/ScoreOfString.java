package com.leetcode.string.eassy;

public class ScoreOfString {

  public static void main(String[] args) {
    System.out.println(scoreOfString("hello"));
  }

  private static int scoreOfString(String s) {

    int current = 0;
    int next = 1;
    int score = 0;
    while (next != s.length()) {
      score += Math.abs(s.charAt(current) - s.charAt(next));
      current++;
      next++;
    }
    return score;
  }

}
