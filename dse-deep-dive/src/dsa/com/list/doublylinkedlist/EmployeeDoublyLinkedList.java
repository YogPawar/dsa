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

  public EmployeeNode removeFront() {
    if (isEmpty()) {
      return null;
    }
    EmployeeNode removeNode = head;
    head = removeNode.getNext();
    removeNode.setNext(null);
    size--;
    return removeNode;

  }

  public EmployeeNode getTail() {
    return tail;
  }


}
