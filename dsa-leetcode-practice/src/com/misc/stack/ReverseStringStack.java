package com.misc.stack;

import java.util.Stack;

public class ReverseStringStack {

  public static String reverseString(String input) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      stack.push(input.charAt(i));
    }
    String reverseString = "";
    while (!stack.isEmpty()) {
      reverseString = reverseString.concat(stack.pop().toString());
    }
    return  reverseString;
  }

  public static void main(String[] args) {
    String reverseString = reverseString("hello");
    System.out.println(reverseString);
  }

}
