package dsa.com.list.doublylinkedlist;

public class EmployeeDoublyLinkedList {

  EmployeeNode head;

  EmployeeNode tail;

  private int size = 0;

  public EmployeeNode getHead() {
    return head;
  }

  public void addToFront(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);
    node.setNext(head);
    if (head == null) {
      tail = node;
    } else {
      head.setPrevious(node);
    }
    head = node;
    size++;
  }

  public void addToEnd(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);
    if (tail == null) {
      head = node;
    } else {
      tail.setNext(node);
      node.setPrevious(tail);
    }
    tail = node;
    size++;
  }

  public void printList() {
    EmployeeNode current = head;
    System.out.println("Head-> ");
    while (current != null) {
      System.out.println(current);
      System.out.println("->  ");
      current = current.getNext();
    }
    System.out.println("null");
  }

  public int getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return (head == null);
  }

  public EmployeeNode removeFromFront() {
    if (isEmpty()) {
      return null;
    }

    EmployeeNode removeNode = head;

    if (head.getNext() == null) {
      tail = null;

    } else {
      head.getNext().setPrevious(null);
    }
    head = head.getNext();
    removeNode.setNext(null);
    size--;
    return removeNode;

  }

  public EmployeeNode getTail() {
    return tail;
  }

  public EmployeeNode removeFromEnd() {
    if (isEmpty()) {
      return null;
    }
    EmployeeNode removeNode = tail;
    if (tail.getPrevious() == null) {
      head = null;
      tail = null;
    } else {
      removeNode.getPrevious().setNext(null);
      size--;
      removeNode.setNext(null);
      tail = removeNode.getPrevious();
    }
    return removeNode;

  }

  public boolean addBefore(Employee addEmployee, Employee beforeEmployee) {
    if (head == null) {
      return false;
    }
    EmployeeNode current = head;
    while (current != null && !current.getEmployee().getFirstName()
        .equals(beforeEmployee.getFirstName())) {
      current = current.getNext();
    }
    if (current == null) {
      return false;
    }
    EmployeeNode newEmployee = new EmployeeNode(addEmployee);
    newEmployee.setPrevious(current.getPrevious());
    newEmployee.setNext(current);
    current.setPrevious(newEmployee);

    if (head == current) {
      head = newEmployee;
    } else {
      newEmployee.getPrevious().setNext(newEmployee);
    }
    size += 1;
    return true;
  }

}
