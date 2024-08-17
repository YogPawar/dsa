package com.book.problems.queue;

import com.book.queue.linkedqueue.LinkedQueue;
import com.book.queue.linkedqueue.QueueNode;
import com.book.stack.linkedlist.LinkedStack;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

  public static void main(String[] args) throws Exception {
    LinkedQueue queue = new LinkedQueue();
    queue.enQueue(5);
    queue.enQueue(6);
    queue.enQueue(7);
    queue.enQueue(8);
    queue.enQueue(9);

    System.out.println("Before reverse : ");
    queue.print();
    LinkedQueue queue1 = reverseQueue(queue);
    System.out.println("After reverse : ");
    queue1.print();

  }

  private static LinkedQueue reverseQueue(LinkedQueue queue) throws Exception {
    LinkedStack<Integer> stack = new LinkedStack<>();
    while (!queue.isEmpty()) {
      stack.push(queue.deQueue());
    }
    while (!stack.isEmpty()) {
      queue.enQueue(stack.pop());
    }
    return queue;
  }

}
