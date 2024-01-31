package com.leetcode.easy;

public class Palindrome {

  private static boolean isPalindrome(int num) {
    if (num < 0) {
      return false;
    }

    int reverseNum = 0;
    int temp = num;

    while (temp != 0) {
      int digit = temp % 10;
      reverseNum = reverseNum * 10 + digit;
      temp = temp / 10;
    }
    return num == reverseNum;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }
}
