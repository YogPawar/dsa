package com.leetcode.linkedlist;

import java.util.List;

public class ListNode {

  int val;
  ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public void insert(int value) {
    ListNode newNode = new ListNode(value);
    if (this.next == null) {
      this.next = newNode;
    } else {
      ListNode current = this.next;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void printList() {
    ListNode current = this;
    while (current != null) {
      System.out.print(current.val + " ");
      current = current.next;
    }
    System.out.println();
  }

  public ListNode get() {
    return this;
  }
}
