package com.book.linkedlist;

public class Node<T extends Comparable<T>> {

  public T data;
  Node<T> next;

  public Node(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
