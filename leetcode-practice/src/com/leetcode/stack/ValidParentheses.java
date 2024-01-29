package com.leetcode.stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

  public static boolean isValid(String s) {
    HashMap<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put(']', '[');
    map.put('}', '{');

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      Character currentChar = s.charAt(i);
      if (map.containsKey(currentChar)) {
        char pop = !stack.isEmpty() ? stack.pop() : '#';
        if (pop != map.get(currentChar)) {
          return false;
        }
      } else {
        stack.push(currentChar);
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    String s = "()[]{}";
    System.out.println(isValid(s));
  }
}
