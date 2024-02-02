package dsa.com.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {

  private Employee[] stack;
  private int top = 0;

  public ArrayStack(int capacity) {
    stack = new Employee[capacity];
  }

  //timecomplexity for this is O(n) as we need to resize the array if array is full
  public void push(Employee employee) {
    if (top == stack.length) {
      Employee[] newEmployee = new Employee[2 * stack.length];
      System.arraycopy(employee, 0, newEmployee, 0, stack.length);
    }
    stack[top++] = employee; // assign the employee to last index of stack.
  }

  public Employee pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    Employee pop = stack[--top];
    stack[top] = null;
    return pop;

  }

  public boolean isEmpty() {
    return top == 0;
  }

  public Employee peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return stack[top - 1];
  }

  public int size() {
    return top;
  }

  public void printStack() {
    for (int i = top - 1; i >= 0; i--) {
      System.out.println(stack[i]);
    }
  }
}
