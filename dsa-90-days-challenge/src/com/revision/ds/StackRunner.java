package com.revision.ds;

public class StackRunner {

  public static void main(String[] args) throws Exception {
    Stack stack = new Stack(6);
    stack.push(7);
    stack.push(8);
    stack.push(9);
    stack.push(10);

    stack.printStack();
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    stack.printStack();
    System.out.println(stack.pop());

    System.out.println(stack.peek());


  }

}
