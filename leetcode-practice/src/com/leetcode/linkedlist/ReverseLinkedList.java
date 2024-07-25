package com.leetcode.linkedlist;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    while (current != null) {
      ListNode temp = current.next;
      current.next = prev;
      prev = temp;
      current = temp;
    }
    return prev;
  }

  main
}
