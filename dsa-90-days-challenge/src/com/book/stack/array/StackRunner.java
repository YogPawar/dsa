package com.book.stack.array;

public class StackRunner {

  public static void main(String[] args) {
    try {
      Stack stack = new Stack();
      stack.push(10);
      stack.push(11);
      stack.push(12);
      stack.push(13);
      System.out.println(stack.top());
      stack.printStack();
      System.out.println("Stack Size : " + stack.size());
      stack.pop();
      System.out.println();
      System.out.println(stack.top());
      stack.printStack();
      System.out.println("Stack Size : " + stack.size());
      stack.push(34);
      System.out.println();
      System.out.println(stack.top());
      stack.printStack();
      System.out.println("Stack Size : " + stack.size());
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

}
