package com.book.stack.problems;

import java.util.Stack;

public class ValidParenthesis {

  public static boolean isValidSymbol(String symbols) {
    Stack<Character> symbolStck = new Stack<>();
    if (symbols == null || symbols.isEmpty()) {
      return false;
    }

    //iterate over a string and push the symbols in stack
    for (int i = 0; i < symbols.length(); i++) {
      if (symbols.charAt(i) == ')') {
        if (!symbolStck.isEmpty() && symbolStck.peek() == '(') {
          symbolStck.pop();
        } else {
          return false;
        }
      } else if (symbols.charAt(i) == ']') {
        if (!symbolStck.isEmpty() && symbolStck.peek() == '[') {
          symbolStck.pop();
        } else {
          return false;
        }
      } else if (symbols.charAt(i) == '}') {
        if (!symbolStck.isEmpty() && symbolStck.peek() == '{') {
          symbolStck.pop();
        } else {
          return false;
        }
      } else if (symbols.charAt(i) == '>') {
        if (!symbolStck.isEmpty() && symbolStck.peek() == '<') {
          symbolStck.pop();
        } else {
          return false;
        }
      } else {
        symbolStck.push(symbols.charAt(i));
      }
    }
    return symbolStck.isEmpty();
  }

  public static void main(String[] args) {
    String symbols = "(((())))";
    System.out.println("Case 1 : " + symbols);
    System.out.println(isValidSymbol(symbols));

    String symbols2 = "{{{}}}}";
    System.out.println("Case 2 : " + symbols2);
    System.out.println(isValidSymbol(symbols2));


    String symbols3 = "({)}";
    System.out.println("Case 3 : " + symbols3);
    System.out.println(isValidSymbol(symbols3));


    String symbols4 = "(){}[]<>";
    System.out.println("Case 4 : " + symbols4);
    System.out.println(isValidSymbol(symbols4));

    String symbols5 = "{[(<>)]}";
    System.out.println("Case 5 : " + symbols5);
    System.out.println(isValidSymbol(symbols5));


  }

}
