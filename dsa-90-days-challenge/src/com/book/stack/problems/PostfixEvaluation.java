package com.book.stack.problems;

import java.util.Stack;

public class PostfixEvaluation {

  private static int evaluate(String tokens) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < tokens.length(); i++) {
      char ch = tokens.charAt(i);
      //another approach to convert char to int is subtract the '0' from character
      if (ch == '+') {
        int firstNum = stack.pop();
        int secondNum = stack.pop();
        stack.push(firstNum + secondNum);
      } else if (ch == '-') {
        int firstNum = stack.pop();
        int secondNum = stack.pop();
        stack.push(secondNum - firstNum);
      } else if (ch == '*') {
        int firstNum = stack.pop();
        int secondNum = stack.pop();
        stack.push(firstNum * secondNum);
      } else if (ch == '/') {
        int firstNum = stack.pop();
        int secondNum = stack.pop();
        stack.push(firstNum / secondNum);
      } else {
        stack.push(Integer.parseInt(String.valueOf(ch)));
      }
    }

    return stack.pop();
  }

  public static void main(String[] args) {
    String postFix = "123*+5-"; //3 *2  = 6; 6+ 1 = 5; 7-5 = 2
    System.out.println(evaluate(postFix));
  }
}
