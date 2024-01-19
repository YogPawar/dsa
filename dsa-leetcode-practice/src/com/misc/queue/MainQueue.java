package com.misc.queue;

public class MainQueue {

  public static void main(String[] args) {
    Queue queue = new Queue(35);
    queue.enqueue(6);
    queue.enqueue(7);

    queue.getFirst();
    queue.getLast();
    queue.getLength();
    queue.printQueue();

    System.out.println("removed item: " + queue.dequeue().value);
    queue.getFirst();
    queue.getLast();
    queue.getLength();
    queue.printQueue();

  }

}
