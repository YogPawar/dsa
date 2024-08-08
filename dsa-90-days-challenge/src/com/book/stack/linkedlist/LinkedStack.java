package com.book.stack.linkedlist;

import java.util.EmptyStackException;

public class LinkedStack<T> {

  private int length;
  private ListNode top;

  public int size() {
    return getLength();
  }

  public int top() throws Exception {
    return getTopValue();
  }

  //Removed the data at the top of the stack and return a reference to it
  public T pop() throws Exception {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    T result = (T) top.getData();
    top = top.getNext();
    length--;
    return result;
  }

  //Add the specified data to the top of this stack
  public void push(T data) {
    ListNode newNode = new ListNode(data);
    newNode.setNext(top);
    top = newNode;
    length++;
  }

  public void deleteStack() {
    top = null;
    length = -1;
  }

  public void printStack() {

    ListNode traverse = top;
    while (traverse != null) {
      System.out.print(traverse.getData() + " ");
      traverse = traverse.getNext();
    }

  }

  public boolean isEmpty() {
    return (length == 0);
  }

  public int getLength() {
    return this.length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public ListNode getTop() {
    return this.top;
  }

  public int getTopValue() {
    return (int) this.top.data;
  }

  class ListNode<T> {

    private T data;
    private ListNode<T> next;

    ListNode(T data) {
      this.data = data;
      this.next = null;
    }

    public ListNode<T> getNext() {
      return next;
    }

    public void setNext(ListNode<T> next) {
      this.next = next;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }
  }

}
