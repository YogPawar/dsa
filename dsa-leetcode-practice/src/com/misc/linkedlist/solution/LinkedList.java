package com.misc.linkedlist.solution;

public class LinkedList {

  private Node head;
  private Node tail;
  private int length;

  class Node {

    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public Node getHead() {
    return head;
  }

  public Node getTail() {
    return tail;
  }

  public int getLength() {
    return length;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public void printAll() {
    if (length == 0) {
      System.out.println("Head: null");
      System.out.println("Tail: null");
    } else {
      System.out.println("Head: " + head.value);
      System.out.println("Tail: " + tail.value);
    }
    System.out.println("Length:" + length);
    System.out.println("\nLinked List:");
    if (length == 0) {
      System.out.println("empty");
    } else {
      printList();
    }
  }

  public void makeEmpty() {
    head = null;
    tail = null;
    length = 0;
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  /**
   * Check if the Linked List has a loop if linked list has loop then return true else return false
   *
   * @return true/false
   */
  public boolean hasLoop() {
    Node fast = head;
    Node slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true;
      }
    }
    return false;

  }

  /**
   * Find the middle element form the linked list
   *
   * @return
   */
  public Node findMiddleElement() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public Node findKthFromEnd(int k) {
    if (head == null || tail == null) {
      return null;
    }
    Node fast = head;
    Node slow = head;

    // Move fast pointer k steps ahead
    for (int i = 0; i < k; i++) {
      if (fast == null) { //if K is out of bond then return null;
        return null;
      }
      fast = fast.next;
    }

    // Move both pointers until fast reaches the end
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow; // Return the kth node from the end (slow pointer)
  }

  public void partitionList(int x) {
    if (head == null) {
      return;
    }

    Node dummy1 = new Node(0);
    Node dummy2 = new Node(0);

    Node prev1;
    Node prev2;

    prev2 = dummy2;
    prev1 = dummy1;
    Node current = head;

    while (current != null) {
      if (current.value < x) {
        prev1.next = current;
        prev1 = current;
      } else {
        prev2.next = current;
        prev2 = current;
      }
      current = current.next;
    }

    prev2.next = null;
    prev1.next = dummy2.next;
    head = dummy1.next;
  }


  public void removDuplicate() {

  }
}
