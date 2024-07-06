package com.misc.mis;

public class ReverseNumber {

  public static void main(String[] args) {
    System.out.println(reverseNumber(121));
  }

  public  static  int reverseNumber(int number) {
    int reverese = 0;
    int reminder = 0;
    while (number != 0) {
      reminder = number % 10;
      reverese = reverese * 10 + reminder;
      number = number / 10;
    }
    return reverese;
  }

}
