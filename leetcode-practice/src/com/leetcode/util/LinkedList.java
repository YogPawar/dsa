package com.leetcode.util;

public class LinkedList {

  Node head;


  public LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
  }


  public static class Node {

    public int value;
    public Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }

  }

  public void printlist() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public Node getHead() {
    return this.head;
  }

  public Node addTwoList(LinkedList list1, LinkedList list2) {
    Node l1 = list1.getHead();
    Node l2 = list2.getHead();

    int carry = 0;

    Node dummyNode = new Node(0);
    Node tail = dummyNode;

    while (l1 != null || l2 != null || carry != 0) {
      int digit1 = (l1 != null) ? l1.value : 0;
      int digit2 = (l2 != null) ? l2.value : 0;

      int sum = digit1 + digit2 + carry;
      int digit = sum % 10;
      carry = sum / 10;

      Node newNode = new Node(digit);
      tail.next = newNode;
      tail = tail.next;

      l1 = (l1 != null) ? l1.next : null;
      l2 = (l2 != null) ? l2.next : null;
    }
    Node result = dummyNode.next;
    dummyNode.next = null;
    return result;

  }
}