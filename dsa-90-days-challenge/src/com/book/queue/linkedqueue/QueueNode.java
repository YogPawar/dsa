package com.book.queue.linkedqueue;

public class QueueNode {

  private int data = 0;
  private QueueNode next;

  public QueueNode(int data) {
    this.data = data;
    this.next = null;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public QueueNode getNext() {
    return next;
  }

  public void setNext(QueueNode next) {
    this.next = next;
  }
}
