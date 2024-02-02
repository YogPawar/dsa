package dsa.com.stack;

import java.util.LinkedList;

public class LinkedListStack {

  private LinkedList<Employee> stack;

  public LinkedListStack() {
    stack = new LinkedList<>();
  }

  public Employee peek() {
    return stack.peek();
  }

  public Employee pop() {
    return stack.pop();
  }

  public void push(Employee employee) {
    stack.push(employee);
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public void printStack() {
    for (Employee employee : stack) {
      System.out.println(employee);
    }
  }
}
