package com.misc.sorting.bubble.solution;

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
    return this.length;
  }

  public void makeEmpty() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public void printList() {
    Node temp = this.head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
  }

  public void append(int value) {
    Node newNode = new Node(value);
    //if list is empty
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  public void bubbleSort() {
    if (length < 2) {
      return; //already sorted
    }

    Node sorteUntil = null;

    while (sorteUntil != this.head.next) {
      Node current = this.head;
      while (current.next != sorteUntil) {
        Node nextNode = current.next;
        if (current.value > nextNode.value) {
          int temp = current.value;
          current.value = nextNode.value;
          nextNode.value = temp;
        }
        current = current.next;
      }
      sorteUntil = current;
    }
  }

}