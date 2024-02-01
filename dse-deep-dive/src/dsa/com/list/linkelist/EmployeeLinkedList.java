package dsa.com.list.linkelist;

public class EmployeeLinkedList {

  EmployeeNode head;

  private int size = 0;

  public EmployeeNode getHead() {
    return head;
  }

  public void addToFront(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);
    node.setNext(head);
    head = node;
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

}
