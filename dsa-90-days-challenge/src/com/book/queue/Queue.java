package com.book.queue;

public class Queue {

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
    this.capacity = DEFAULT_CAPACITY;
  }

  public Queue(int capacity) {
    this.capacity = capacity;
    queue = new int[capacity];
    front = 0;
    rear = -1;
  }

  public void enqueue(int data) {
    if (size() >= capacity) {
      throw new QueueFullException("Queue is full");
    } else {
      queue[size++] = data;
      rear++;
    }
  }

  public int dequeue() {
    if (size() < 0) {
      throw new QueueEmptyException("Queue is empty");
    }

    return 0;
  }

  public int getFront() {
    return queue[front];
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
}
