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

  public static void main(String[] args) {
    DublyLinkedList dl = new DublyLinkedList(6);
    dl.append(5);
    dl.append(8);
    dl.prepend(100);
    dl.append(200);
    dl.swapFirstLast();
    dl.printList();

    System.out.println();
    System.out.println("Reverse List");
    dl.reverse();
    dl.printList();
  }

  private void swapFirstLast() {
    if (length < 2) {
      return;
    }

    int temp = head.value;
    head.value = tail.value;
    tail.value = temp;
  }


  private void reverse() {
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
}
