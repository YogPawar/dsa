package com.misc.stack.solutions;

import java.util.ArrayList;

public class Stack<T> {

  ArrayList<T> stack = new ArrayList<>();

  public void push(T value) {
    stack.add(value);
  }

  public T peek() {
    if (stack.isEmpty()) {
      return null;
    } else {
      return stack.get(stack.size() - 1);
    }
  }

  public void printStack() {
    for (int i = stack.size() - 1; i >= 0; i--) {
      System.out.println(stack.get(i));
    }
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }


  public void sort(Stack<Integer> stack) {
    Stack<Integer> additionalStack = new Stack<>();
    while (!stack.isEmpty()) {
      int temp = stack.pop();
      while (!additionalStack.isEmpty() && temp < additionalStack.peek()) {
        stack.push(additionalStack.pop());
      }
      additionalStack.push(temp);
    }
    while (!additionalStack.isEmpty()) {
      stack.push(additionalStack.pop());
    }
  }

  public T pop() {
    if (isEmpty()) {
      return null;
    }
    return stack.remove(stack.size() - 1);
  }

  public static void main(String[] args) {
    Stack<Integer> stackOne = new Stack<>();
    stackOne.push(6);
    stackOne.push(7);
    stackOne.push(2);
    stackOne.push(8);

    System.out.println("Peek : " + stackOne.peek());
    stackOne.sort(stackOne);
    stackOne.printStack();

  }
}
