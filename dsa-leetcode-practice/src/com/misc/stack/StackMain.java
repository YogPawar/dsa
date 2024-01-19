package com.misc.stack;

import java.sql.SQLOutput;

public class StackMain {

  public static void main(String[] args) {
    Stack stack = new Stack(3);
    stack.push(8);
    stack.push(9);
    stack.push(10);
    stack.printStack();
    System.out.println("top is :");
    stack.getTop();
    System.out.println("Popped element is : " + stack.pop().value);
    System.out.println("top is :");
    stack.printStack();

  }

}
