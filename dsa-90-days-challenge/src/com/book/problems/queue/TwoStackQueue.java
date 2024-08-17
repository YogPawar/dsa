package com.book.problems.queue;

import java.util.Stack;

public class TwoStackQueue {

  Stack<Integer> stackOne = new Stack<>();
  Stack<Integer> stackTwo = new Stack<>();

  public static void main(String[] args) {
    TwoStackQueue queue = new TwoStackQueue();
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    System.out.println(queue.dequeue());
  }

  public void enqueue(int data) {
    stackOne.push(data);
  }

  public int dequeue() {
    if (stackTwo.isEmpty()) {
      while (!stackOne.isEmpty()) {
        stackTwo.push(stackOne.pop());
      }
    }
    return stackTwo.pop();
  }
}
