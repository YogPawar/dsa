package com.book.stack.linkedlist;

public class LinkeStackRunner {

  public static void main(String[] args) throws Exception {
    LinkedStack<Integer> linkedStack = new LinkedStack<>();

    linkedStack.push(10);
    linkedStack.push(15);
    linkedStack.push(16);
    linkedStack.push(17);

    linkedStack.printStack();
    System.out.println("\nTop : " + linkedStack.top() + "and Size : " + linkedStack.size());

    linkedStack.pop();
    linkedStack.printStack();
    System.out.println("\nTop : " + linkedStack.top() + "and Size : " + linkedStack.size());
  }

}
