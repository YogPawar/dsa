package com.misc.sorting.selection.solution;

import javax.management.remote.JMXConnectorServerMBean;

public class LinkedList {

  int length;
  Node head;
  Node tail;

  LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }


  class Node {

    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public Node getHead() {
    return this.head;
  }

  public Node getTail() {
    return this.tail;
  }

  public int getLength() {
    return length;
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      this.tail.next = newNode;
      this.tail = newNode;
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

  public void selectionSort() {
    if (length < 2) {
      return;
    }

    Node current = this.head;
    while (current.next != null) {
      Node smallest = current;
      Node innerCurrent = current.next;

      while (innerCurrent != null) {
        if (innerCurrent.value < smallest.value) {
          smallest = innerCurrent;
        }
        innerCurrent = innerCurrent.next;
      }
      if (smallest != current) {
        int temp = smallest.value;
        smallest.value = current.value;
        current.value = temp;
      }
      current = current.next;
    }
    this.tail = current;
  }
}
