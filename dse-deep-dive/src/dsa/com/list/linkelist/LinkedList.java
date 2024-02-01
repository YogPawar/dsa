package dsa.com.list.linkelist;

/**
 * Sorted list
 */
public class LinkedList {

  int size;
  Node head;

  Node tail;

  LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    size += 1;
  }

  class Node {

    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }

  }

  public void insert(int value) {
    if (head == null || head.value > value) {
      addToFront(value);
      return;
    }

    Node current = head.next;
    Node previous = head;

    while (current != null && current.value < value) {
      previous = current;
      current = current.next;
    }

    Node newNode = new Node(value);
    newNode.next = current;
    previous.next = newNode;
    size += 1;
  }

  private void addToFront(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
      size += 1;
    } else {
      newNode.next = head;
      head = newNode;
      size += 1;
    }
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print("-> ");
      System.out.print(temp.value);
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(2);
    ll.insert(5);
    ll.insert(3);
    ll.insert(8);
    ll.insert(6);
    ll.printList();
  }
}
