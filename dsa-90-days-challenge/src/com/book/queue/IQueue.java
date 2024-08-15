package com.book.queue;

public interface IQueue {

  void enQueue(int data);

  int deQueue();

  int size();

  boolean isEmpty();

  boolean isFull();

  void print();

  int getFront();
  int getRear();
}
