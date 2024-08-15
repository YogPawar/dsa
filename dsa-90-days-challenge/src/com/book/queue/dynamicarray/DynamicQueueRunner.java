package com.book.queue.dynamicarray;

public class DynamicQueueRunner {

  public static void main(String[] args) {
    DynamicQueue queue = new DynamicQueue(2);

    queue.enQueue(6);
    queue.enQueue(7);
    queue.enQueue(8);
    queue.enQueue(10);
    queue.print();

    System.out.println("Front :" + queue.getFront());
    System.out.println("Rear :" + queue.getRear());

    System.out.println("Size : " + queue.size());
    System.out.println("isEmpty : " + queue.isEmpty());
    System.out.println("isFull : " + queue.isFull());
  }

}
