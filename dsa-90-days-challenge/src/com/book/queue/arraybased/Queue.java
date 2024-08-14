package com.book.queue.arraybased;

import com.book.queue.IQueue;
import com.book.queue.QueueFullException;

public class Queue implements IQueue {

  private final int DEFAULT_CAPACITY = 16;
  private final int[] queue;
  private int size = 0;
  private int front;
  private int rear;
  private int capacity;

  public Queue() {
    queue = new int[DEFAULT_CAPACITY];
    front = 0;
    rear = -1;
    size = 0;
    this.capacity = DEFAULT_CAPACITY;
  }

  public Queue(int capacity) {
    this.capacity = capacity;
    queue = new int[capacity];
    front = 0;
    rear = -1;
    size = 0;
  }

  //Add the element into Queue
  public void enQueue(int data) {
    if (size() >= capacity) {
      throw new QueueFullException("Queue is full");
    } else {
      queue[++rear] = data;
      size++;
    }
  }

  //Remove the element from the queue. Start from the front.
  public int deQueue() {
    if (size() < 0) {
      throw new IllegalStateException("Queue is empty");
    } else {
      int data = queue[front];
      queue[front++] = 0;
      size--;
      return data;
    }
  }

  public int getFront() {
    return (front > capacity - 1 || rear < 0) ? 0 : queue[front];
  }

  public void setFront(int front) {
    this.front = front;
  }

  public int getRear() {
    return queue[rear];
  }

  public void setRear(int rear) {
    this.rear = rear;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean isFull() {
    return size == capacity;
  }

  @Override
  public void print() {
    for (int i : queue) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
