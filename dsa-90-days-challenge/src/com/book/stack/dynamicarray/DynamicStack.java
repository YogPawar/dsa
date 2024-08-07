package com.book.stack.dynamicarray;

import com.book.stack.IStack;

public class DynamicStack implements IStack {

  private final static int CAPACITY = 4;
  private final static int MINCAPACITY = 1 << CAPACITY - 1;
  public int capacity;
  protected int[] stack;
  private int top = -1;

  public DynamicStack() {
    this(CAPACITY);
  }

  public DynamicStack(int capacity) {
    this.capacity = capacity;
    stack = new int[this.capacity];
  }

  @Override
  public int size() {
    return top + 1;

  }

  @Override
  public int top() throws Exception {
    if (isEmpty()) {
      throw new Exception();
    }
    return stack[top];
  }

  @Override
  public int pop() throws Exception {
    if (isEmpty()) {
      throw new Exception();
    }
    int data = stack[top];
    stack[top--] = 0;
    shrink();
    return data;
  }

  @Override
  public void push(int data) {
    if (isOverflow()) {
      //create new array and copy the existing into that.
      expand();
    }
    stack[++top] = data;

  }

  private void expand() {
    int length = size();
    int[] dummyStack = new int[length << 1]; //power of 2
    System.arraycopy(stack, 0, dummyStack, 0, length);
    stack = dummyStack; // stack pointing to new stack.
    this.capacity = length << 1; // initialize the new capacity
  }

  private void shrink() {
    int length = size();
    if (length <= MINCAPACITY || top << 2 >= length) {
      return;
    }

    length = length + (top << 1);  //steal means shrink to at 1/2 or less the heap
    if (top < MINCAPACITY) {
      length = MINCAPACITY;
    }
    int[] newStack = new int[length];
    System.arraycopy(stack, 0, newStack, 0, top - 1);
    stack = newStack;
    this.capacity = length;
  }

  @Override
  public void deleteStack() {
    stack = null;
    top = -1;
    this.capacity = CAPACITY;

  }

  @Override
  public void printStack() {
    System.out.print("[ ");
    for (int i : stack) {
      System.out.print(i + " ");
    }
    System.out.print("]");

  }

  @Override
  public boolean isEmpty() {
    return (top < 0);
  }

  @Override
  public boolean isOverflow() {
    return (size() == this.capacity);
  }

}
