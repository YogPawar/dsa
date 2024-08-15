package com.book.queue.dynamicarray;

import com.book.queue.IQueue;

public class DynamicQueue implements IQueue {

  private final int DEFAULT_CAPACITY = 16;
  private int front;
  private int capacity;
  private int rear;
  private int size;
  private int[] queue;

  public DynamicQueue() {
    queue = new int[DEFAULT_CAPACITY];
    front = 0;
    rear = -1;
    size = 0;
    this.capacity = DEFAULT_CAPACITY;
  }

  public DynamicQueue(int capacity) {
    this.capacity = capacity;
    queue = new int[capacity];
    front = 0;
    rear = -1;
    size = 0;

  }

  @Override
  public void enQueue(int data) {
    if (size == capacity) {
      capacity = (size / 2) + size;
      int[] tempQueue = new int[capacity];
      System.arraycopy(queue, 0, tempQueue, 0, size );
      queue = tempQueue;
    }
    queue[++rear] = data;
    size++;
  }

  @Override
  public int deQueue() {
    int data = queue[front];
    queue[front++] = 0;
    return data;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
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

  @Override
  public int getFront() {
    return queue[front];
  }

  @Override
  public int getRear() {
    return queue[rear];
  }
}
