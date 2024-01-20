package com.misc.stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackAl<T> {

  private ArrayList<T> stack = new ArrayList<>();

  public T peek() {
    if (stack.isEmpty()) {
      return null;
    } else {
      return stack.get(stack.size() - 1);
    }
  }

  public void push(T value) {
    stack.add(value);
  }

  public void printStack() {
    stack.forEach(System.out::println);
  }

  public static void main(String[] args) {
    StackAl<Integer> stackAl = new StackAl<>();
    stackAl.push(4);
    stackAl.printStack();
    stackAl.push(67);

    StackAl<String> stringStack = new StackAl<>();
    stringStack.push("Yogesh");
    stringStack.push("Ganesh");
    stringStack.printStack();
  }

}