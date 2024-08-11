package com.book.stack.problems;

import java.util.Stack;

public class InfixEvaluation {

  public static void main(String[] args) {
    String exp = "5+5 - (9 *2)";
    System.out.println(evaluate(exp));
  }

  private static int evaluate(String expression) {

    Stack<Integer> operandStack = new Stack<>();
    Stack<Character> operatorStack = new Stack<>();

    for (int i = 0; i < expression.length(); i++) {
      char token = expression.charAt(i);

      // If the token is a whitespace, skip it
      if (token == ' ') {
        continue;
      }

      // If the token is a digit, read the number and push to operand stack
      if (Character.isDigit(token)) {
        StringBuilder sb = new StringBuilder();
        while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
          sb.append(expression.charAt(i++));
        }
        i--; // Step back after loop
        operandStack.push(Integer.parseInt(sb.toString()));
      }
      // If the token is '(', push it to the operator stack
      else if (token == '(') {
        operatorStack.push(token);
      }
      // If the token is ')', solve the entire sub-expression
      else if (token == ')') {
        while (operatorStack.peek() != '(') {
          operandStack.push(
              applyOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop()));
        }
        operatorStack.pop(); // Pop '('
      }
      // If the token is an operator
      else if (isOperator(token)) {
        while (!operatorStack.isEmpty() && precedence(token) <= precedence(operatorStack.peek())) {
          operandStack.push(
              applyOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop()));
        }
        operatorStack.push(token);
      }
    }

    // Apply remaining operators to remaining operands
    while (!operatorStack.isEmpty()) {
      operandStack.push(
          applyOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop()));
    }

    // The top of operand stack is the result
    return operandStack.pop();
  }

  private static int precedence(char operator) {
    switch (operator) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
    }
    return -1;
  }

  private static int applyOperation(char operator, int a, int b) {
    switch (operator) {
      case '+':
        return a + b;
      case '-':
        return a - b;
      case '/':
        return a / b;
      case '*':
        return a * b;
    }
    return 0;
  }

  private static boolean isOperator(char ch) {
    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
  }


}
