package com.book.queue;

public class QueueFullException extends RuntimeException {

  public QueueFullException() {

  }

  public QueueFullException(String message) {
    System.out.println("Queue is Full.");
  }

}
