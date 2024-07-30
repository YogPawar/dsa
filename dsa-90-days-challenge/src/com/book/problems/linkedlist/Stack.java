package com.book.problems.linkedlist;

import com.book.linkedlist.LinkedList;
import com.book.linkedlist.Node;

public class Stack {

  private final LinkedList<Integer> stack;
  private int top;
  private int size;

  public Stack() {
    stack = new LinkedList<>();
  }

  public void push(int data) {
    stack.prepend(data);
    size++;
    top = data;
  }

  public int pop() {
    if (stack == null) {
      System.out.println("Stack is empty");
      return 0;
    } else {
      Node<Integer> str = stack.removeFromBegin();
      top = stack.getHead();
      return str.getData();
    }
  }

  public void stackPrint() {
    stack.printList();
  }

  public int getTop() {
    return top;
  }

  public void setTop(int top) {
    this.top = top;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
