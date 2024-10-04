package com.dsa.eassy.stack;

import java.util.Stack;

public class BackspaceStringCompare {

  private static boolean isMatching(String s, String t) {
    Stack<Character> stackOne = new Stack<>();
    Stack<Character> stackTwo = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '#') {
        if (!stackOne.isEmpty()) {
          stackOne.pop();
        }
      } else {
        stackOne.push(s.charAt(i));
      }
    }
    for (int i = 0; i < t.length(); i++) {
      if (t.charAt(i) == '#') {
        if (!stackTwo.isEmpty()) {
          stackTwo.pop();
        }
      } else {
        stackTwo.push(t.charAt(i));
      }
    }
    while (!stackOne.isEmpty() && !stackTwo.isEmpty()) {
      if (!stackOne.pop().equals(stackTwo.pop())) {
        return false;
      }
    }
    return stackOne.isEmpty() && stackTwo.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(isMatching("#a#bc", "a#bc"));
  }

}
