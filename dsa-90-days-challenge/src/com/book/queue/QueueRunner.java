package com.book.queue;

public class QueueRunner {

  public static void main(String[] args) {
    Queue queue = new Queue(2);
    queue.enqueue(6);
    System.out.println("Front :" + queue.getFront());
    System.out.println("Rear" + queue.getRear());
    queue.enqueue(7);
    System.out.println("Front :" + queue.getFront());
    System.out.println("Rear" + queue.getRear());
    queue.enqueue(8);
    System.out.println("Front :" + queue.getFront());
    System.out.println("Rear" + queue.getRear());
  }

}
