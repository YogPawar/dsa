package com.book.queue.linkedqueue;

public class LinkedQueueRunner {

  public static void main(String[] args) {
    LinkedQueue queue = new LinkedQueue();
    System.out.println("Is empty : " + queue.isEmpty());
    queue.enQueue(63);
    queue.enQueue(64);
    queue.enQueue(66);
    queue.enQueue(69);
    queue.print();
    System.out.println("Size : " + queue.size());
    System.out.println("Front : " + queue.getFront());
    System.out.println("Rear : " + queue.getRear());
    queue.deQueue();
    queue.print();
    System.out.println("Is empty : " + queue.isEmpty());
    System.out.println("Size : " + queue.size());
    System.out.println("Front : " + queue.getFront());
    System.out.println("Rear : " + queue.getRear());


  }

}
