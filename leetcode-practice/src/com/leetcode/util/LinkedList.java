package com.leetcode.util;

import org.w3c.dom.Node;

public class LinkedList {

  Node head;


  public LinkedList(int value) {
    Node newNode = new Node(value);
    head = newNode;
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

  /**
   * it will be written if list is cyclic or not we will implement the slow pointer fast pointer
   * algorithm to identify if there liked list is cyclic or not
   * <p>
   * Floyd’s Cycle-Finding Algorithm // fast slow approach // 2 pointers // "tortoise and the hare
   * algorithm"
   *
   * @return
   */
  public boolean isCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  /*
  * Time Complexity: O(m*n), where m and n are number of nodes in two linked list.
  Auxiliary Space: O(1), Constant Space is used.
  *
  * */
  public Node isInterSectionApproach1(Node first, Node second) {
    if (first == null || second == null) {
      return null;
    }

    while (second != null) {
      Node temp = first;
      while (temp != null) {
        if (second == temp) {
          return second;
        }
        temp = temp.next;

      }
      second = second.next;
    }
    return null;
  }

  public Node isInterSectionApproach2(Node first, Node second) {
    if (first == null || second == null) {
      return null;
    }

    Node a = first;
    Node b = second;
    while (a != b) {
      a = a == null ? second : a.next;
      b = b == null ? first : b.next;
    }
    return a;
  }

  public void removeDuplicate(int value) {
    Node current = head;
    while (current != null) {
      Node runner = current;
      if (runner.next.value == value) {
        runner.next = runner.next.next;
      } else {
        runner = runner.next;
      }
      current = current.next;
    }
  }

  public void reverseList() {
    if (head == null) {
      return;
    }

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node tail = temp;
    temp = head;
    head = tail;

    Node after = temp.next;
    Node before = null;
    while (temp != null || temp.next != null) {
      after = temp.next;
      temp.next = before;
      before = temp;
      temp = after;
      temp= temp.next;
    }
  }

  public static class Node {

    public int value;
    public Node next;

    public Node(int value) {
      this.value = value;
    }
  }
}