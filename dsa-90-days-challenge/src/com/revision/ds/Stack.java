package com.revision.ds;

public class Stack {

  StackNode top;
  int size;

  public Stack(int data) {
    StackNode node = new StackNode(data);
    top = node;
    size = 1;
  }

  public int size() {
    return this.size;
  }

  public void push(int data) {
    StackNode newNode = new StackNode(data);
    if (top != null) {
      newNode.next = top;
      top = newNode;
    } else {
      top = newNode;
    }
    size++;
  }

  public StackNode top() throws Exception {
    if (top == null) {
      throw new Exception();
    }
    return top;
  }

  public StackNode peek() throws Exception {
    return top();
  }

  public StackNode pop() {
    if (top != null) {
      StackNode popNode = top;
      top = popNode.next;
      popNode.next = null;
      size--;
      return popNode;
    }
    return null;
  }

  public void printStack() {
    StackNode itr = top;
    System.out.print("[");
    while (itr != null) {
      System.out.print(itr.data + " ");
      itr = itr.next;
    }
    System.out.print("]");

  }


  class StackNode {

    int data;
    StackNode next;

    public StackNode(int data) {
      this.data = data;
    }

    @Override
    public String toString() {
      return "Top : " + top.data;
    }
  }
}
