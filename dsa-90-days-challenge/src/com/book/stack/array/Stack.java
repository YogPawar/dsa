package com.book.stack.array;

import java.sql.SQLOutput;

public class Stack {

  //default capacity
  public static final int CAPACITY = 10;
  //index of the top element
  protected int top = -1;
  //length of the stack.
  protected int capacity;
  //array used to implement the stack
  protected int[] stack;

  //Initialize the stack to use an array of default length
  public Stack() {
    this(CAPACITY);
  }

  //Initialize the stack to use and array of given length
  public Stack(int capacity) {
    this.capacity = capacity;
    stack = new int[this.capacity];
  }

  //return the number of element in  the stack TC : O(1)
  public int size() {
    return top + 1;
  }

  //test if stack is empty or not. TC O(1)
  public boolean isEmpty() {
    return (top < 0);
  }

  //Insert the element into stack TC : O(1)
  public void push(int data) {
    if (size() == top) {
      throw new StackOverflowError();
    }
    stack[++top] = data;
  }

  //Return the top element without deleting. TC O(1)
  public int top() throws Exception {
    if (isEmpty()) {
      throw new Exception();
    }
    return stack[top];
  }

  //Remove the top element from the stack. This method runs in TC O(1)
  public int pop() throws Exception {
    if (isEmpty()) {
      throw new Exception();
    }
    int data = stack[top];
    stack[top--] = 0;
    return data;
  }


  //TC O(n) to scan and print the all element
  public void printStack() {
    System.out.print("[ ");
    for (int i : stack) {
      System.out.print(i + " ");
    }
    System.out.print("]");
  }

  //TC O(1)
  public void deleteStack() {
    stack = null;
    top = -1;
  }
}
