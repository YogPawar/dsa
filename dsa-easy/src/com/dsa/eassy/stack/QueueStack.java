package com.dsa.eassy.stack;

import java.util.Stack;

public class QueueStack {

  Stack<Integer> queueStack;
  Stack<Integer> travelerStack;

  public QueueStack() {
    queueStack = new Stack<>();
    travelerStack = new Stack<>();
  }

  public static void main(String[] args) {
    QueueStack stack = new QueueStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.pop();
    stack.push(5);
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();

    System.out.println(stack.pop());
    System.out.println(stack.peek());
  }

  public void push(int x) {
    travelerStack.push(x);
  }

  private void syncQueueStack() {
    while (!travelerStack.isEmpty()) {
      queueStack.push(travelerStack.pop());
    }
  }

  public int pop() {
    if (!queueStack.isEmpty()) {
      return queueStack.pop();
    } else {
      while (!travelerStack.isEmpty()) {
        queueStack.push(travelerStack.pop());
      }
    }
    return queueStack.pop();
  }

  public int peek() {
    if (!queueStack.isEmpty()) {
      return queueStack.peek();
    } else {
      while (!travelerStack.isEmpty()) {
        queueStack.push(travelerStack.pop());
      }
    }
    return queueStack.peek();
  }

  public boolean isEmpty() {
    syncQueueStack();
    return queueStack.isEmpty();
  }

}
