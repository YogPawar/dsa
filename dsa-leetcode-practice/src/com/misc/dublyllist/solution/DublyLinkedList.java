package com.misc.dublyllist.solution;

public class DublyLinkedList {

  int length;
  Node head;
  Node tail;

  DublyLinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  class Node {

    int value;
    Node prev;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    length++;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
    length++;
  }


  void swapFirstLast() {
    if (length < 2) {
      return;
    }

    int temp = head.value;
    head.value = tail.value;
    tail.value = temp;
  }


  void reverse() {
    Node current = head;
    Node temp = null;

    while (current != null) {
      temp = current.prev; //temp null;
      current.prev = current.next;
      current.next = temp;
      current = current.prev;

    }

    temp = head;
    head = tail;
    tail = temp;
  }

  public boolean isPalindrome() {
    if (length <= 1) {
      return true;
    }
    Node first = head;
    Node last = tail;
    for (int i = 0; i < length / 2; i++) {
      if (first.value != last.value) {
        return false;
      }
      first = first.next;
      last = last.prev;
    }
    return true;
  }

  public void swapPairs() {
    Node dummyNode = new Node(0);
    dummyNode.next = head;
    Node previousNode = dummyNode;
    while (head != null && head.next != null) {
      Node firstNode = head;
      Node secondNode = head.next;

      previousNode.next = secondNode;
      firstNode.next = secondNode.next;
      secondNode.next = firstNode;

      secondNode.prev = previousNode;
      firstNode.prev = secondNode;

      if (firstNode.next != null) {
        firstNode.next.prev = firstNode;
      }
      head = firstNode.next;
      previousNode = firstNode;
    }

    head = dummyNode.next;
    if (head != null) {
      head.prev = null;
    }
  }
}
