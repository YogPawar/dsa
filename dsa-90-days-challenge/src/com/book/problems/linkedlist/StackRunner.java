package com.book.problems.linkedlist;

public class StackRunner {

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.stackPrint();
    System.out.println("Top :" + stack.getTop());
    System.out.println(stack.pop());
    stack.stackPrint();
    System.out.println("Top : " + stack.getTop());
  }

}
