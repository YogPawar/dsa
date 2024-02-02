package dsa.com.queue;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.org.apache.bcel.internal.generic.DRETURN;

public class EmployeeQueue {

  private Employee[] queue;
  private int first;
  private int last;

  public EmployeeQueue(int capacity) {
    queue = new Employee[capacity];
  }

  public void add(Employee employee) {
    if (last == queue.length) {
      Employee[] copy = new Employee[2 * queue.length];
      System.arraycopy(queue, 0, copy, 0, copy.length);
    }
    queue[last] = employee;
    last++;
  }

  public Employee remove() throws NoSuchFieldException {
    if (size() == 0) {
      throw new NoSuchFieldException();
    }
    Employee employee = queue[first];
    queue[first] = null;
    first++;
    if (size() == 0) {
      first = 0;
      last = 0;
    }

    return employee;
  }

  public Employee peek() throws NoSuchFieldException {
    if (size() == 0) {
      throw new NoSuchFieldException();
    }
    return queue[first];
  }

  private int size() {
    return last - first;
  }

  public void printQueue() {
    for (Employee employee : queue) {
      System.out.println(employee);
    }
  }

}
