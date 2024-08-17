package com.book.problems.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueueStack {

  Queue<Integer> queueOne = new LinkedList<>();
  Queue<Integer> queueTwo = new LinkedList<>();

  public void push(int data) {
    if (queueOne.isEmpty()) {
      queueTwo.offer(data);
    } else {
      queueOne.offer(data);
    }
  }

  public int pop() {
    int i = 0;
    int size = 0;
    if (queueOne.isEmpty()) {
      size = queueTwo.size();
      while (i < size - 1) {
        queueOne.offer(queueTwo.poll());
        i++;

      }
      return queueTwo.poll();
    } else {
      size = queueOne.size();
      while (i < size - 1) {
        queueTwo.offer(queueOne.poll());
        i++;
      }
      return queueOne.poll();
    }
  }
}
