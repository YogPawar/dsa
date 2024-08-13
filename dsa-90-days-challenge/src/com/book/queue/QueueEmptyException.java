package com.book.queue;

public class QueueEmptyException extends RuntimeException {

  public QueueEmptyException(String message) {
    System.out.println(message);
  }
}
