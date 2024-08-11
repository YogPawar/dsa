package com.book.stack.problems;

import java.util.Stack;

public class InfixToPostfixConversion {

  //Function to return precedence of operator
  static int perc(char c) {
    if (c == '^') {
      return 3;
    } else if (c == '/' || c == '*') {
      return 2;
    } else if (c == '+' || c == '-') {
      return 1;
    } else {
      return -1;
    }
  }

  //Function to return associativity of operators
  static char associateActivity(char c) {
    if (c == '^') {
      return 'R';
    } else {
      return 'L';
    }
  }


  public static void main(String[] args) {
    String input = "A * B-(C+D)+E";
    infixToPostifx(input);

  }

  /**
   * input = A * B-(C+D)+E;
   *
   * @param s
   */
  private static void infixToPostifx(String s) {
    StringBuilder postfixConversion = new StringBuilder();
    Stack<Character> expresionStack = new Stack<>();
    //check if it is character or number. and append to sb. if it is operand then push in to stack.
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
        postfixConversion.append(c);
      } else if (c == '(') {
        expresionStack.push(c);
      } else if (c == ')') {
        while (!expresionStack.isEmpty() || expresionStack.peek() != '(') {
          postfixConversion.append(expresionStack.pop());
        }
        expresionStack.pop();//(
      } else {
        while (!expresionStack.isEmpty() && (perc(s.charAt(i)) < perc(expresionStack.peek())
            || perc(s.charAt(i)) == perc(expresionStack.peek())
            && associateActivity(s.charAt(i)) == 'L')) {
          postfixConversion.append(expresionStack.pop());
        }
        expresionStack.push(c);

      }
    }
    System.out.println(postfixConversion);
  }
}
