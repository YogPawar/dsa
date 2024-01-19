package com.misc.stack;

public class Stack {

  private int height;
  private Node top;

  public Stack(int value) {
    Node newNode = new Node(5);
    top = newNode;
    height = 1;
  }

  class Node {

    int value;
    Node next;

    Node(int value) {
      this.value = value;

    }

  }

  public void printStack() {
    Node temp = top;
    while (temp != null) {
      System.out.println(temp.value + ", ");
      temp = temp.next;
    }
  }

  public void getTop() {
    if (top != null) {
      System.out.println(top.value);
    }
  }

  public void getHeight() {
    System.out.println(height);
  }

  public void push(int value) {
    Node newNode = new Node(value);
    if (height == 0) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    height++;
  }

  public Node pop() {
    if (height == 0) {
      return null;
    }
    Node temp = top;
    if (height == 1) {
      top = null;
    } else {
      top = temp.next;
      temp.next = null;
    }
    height--;
    return temp;
  }

}
