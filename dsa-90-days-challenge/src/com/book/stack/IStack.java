package com.book.stack;

public interface IStack {

  int size();

  int top() throws Exception;

  int pop() throws Exception;

  void push(int data);

  void deleteStack();

  void printStack();

  boolean isEmpty();

  boolean isOverflow();

}
