package com.book.stack.dynamicarray;

public class DynamicStackRunner {

  public static void main(String[] args) throws Exception {
    DynamicStack stack = new DynamicStack(2);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(5);
    stack.push(6);
    stack.push(6);
    stack.push(6);
    stack.push(6);
    System.out.println(stack.size());
    stack.pop();
    System.out.println(stack.size());
    stack.printStack();

    stack.pop();
    System.out.println(stack.size());
    stack.printStack();
    stack.pop();
    System.out.println(stack.size());
    stack.printStack();
    stack.pop();
    System.out.println(stack.size());
    stack.printStack();
    stack.pop();
    System.out.println(stack.size());
    stack.printStack();
    stack.pop();
    System.out.println(stack.size());
    stack.printStack();
    stack.pop();
    System.out.println(stack.size());
    stack.printStack();
    stack.pop();
    System.out.println(stack.size());
    stack.printStack();
  }

}
