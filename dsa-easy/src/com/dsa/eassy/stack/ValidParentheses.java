package com.dsa.eassy.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Leetcode : 20 Link : https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParentheses {

  /**
   * TC : O(N) SC: O(N)
   *
   * @param parentheses
   * @return
   */
  private static boolean isValid(String parentheses) {
    HashMap<Character, Character> parenthesesMap = new HashMap<>();
    parenthesesMap.put(')', '(');
    parenthesesMap.put('}', '{');
    parenthesesMap.put(']', '[');
    parenthesesMap.put('>', '<');

    Stack<Character> parenthesesStack = new Stack<>();
    for (int i = 0; i < parentheses.length(); i++) {
      char parChar = parentheses.charAt(i);
      if (parenthesesMap.containsKey(parChar)) {
        char pop = (!parenthesesStack.isEmpty()) ? parenthesesStack.pop() : '#';
        if (pop != parenthesesMap.get(parChar)) {
          return false;
        }
      } else {
        parenthesesStack.push(parChar);
      }
    }
    return parenthesesStack.isEmpty(); //if stack contains the data it me parentheses are invalid.
  }

}
