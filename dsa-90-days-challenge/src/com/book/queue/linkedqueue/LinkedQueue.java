package com.book.queue.linkedqueue;

import com.book.queue.IQueue;

public class LinkedQueue implements IQueue {

  QueueNode front;
  QueueNode rear;

  int size;

  public LinkedQueue() {
  }

  public LinkedQueue(int data) {
    QueueNode newQueueNode = new QueueNode(data);
    front = newQueueNode;
    rear = newQueueNode;
    size = 1;
  }

  @Override
  public void enQueue(int data) {
    QueueNode newQueueNode = new QueueNode(data);
    if (front != null || rear != null) {
      rear.setNext(newQueueNode);
      rear = newQueueNode;
    } else {
      front = newQueueNode;
      rear = newQueueNode;
    }
    size++;
  }

  @Override
  public int deQueue() {
    if (front != null) {
      QueueNode nodeToServe = front;
      front = front.getNext();
      size--;
      if (size == 0) {
        rear = null;
      }
      return nodeToServe.getData();
    }
    return 0;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    return (front == null || rear == null);
  }

  //Linked Queue will never be empty
  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public void print() {
    QueueNode temp = front;
    while (temp != null) {
      System.out.print(temp.getData() + " ");
      temp = temp.getNext();
    }

    System.out.println();

  }

  @Override
  public int getFront() {
    return (this.front != null) ? this.front.getData() : 0;
  }

  @Override
  public int getRear() {
    return (this.rear != null) ? this.rear.getData() : 0;
  }
}
