package com.leetcode.linkedlist;

public class RotatedList {

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1);
    listNode.insert(2);
    listNode.insert(3);
    listNode.insert(4);
    listNode.insert(5);
    listNode.insert(6);
    listNode.insert(7);
    listNode.insert(8);
    listNode.insert(9);

    ListNode rotedList = rotatedRight(listNode.get(), 3);
    rotedList.printList();
    System.out.println(rotedList);
  }

  //TC : O(n*i)
  private static ListNode loop(ListNode head, int i) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode secondLast = head;
    ListNode lastNode = head;
    for (int k = 0; k < i; k++) {
      while (lastNode.next != null) {
        secondLast = lastNode;
        lastNode = lastNode.next;
      }
      secondLast.next = null;
      lastNode.next = head;
      head = lastNode;
    }
    return lastNode;
  }

  private static ListNode rotatedRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }

    //find the length of the list
    int length = 1;
    ListNode oldTail = head;
    while (oldTail.next != null) {
      oldTail = oldTail.next;
      length++;
    }

    //find the effective rotation count

    k = k % length;
    if (k == 0) {
      return head;
    }
    //find new tail
    ListNode newTail = head;
    for (int i = 0; i < length - k - 1; i++) {
      newTail = newTail.next;
    }

    //rotated the list
    ListNode newHead = newTail.next;
    oldTail.next = head;
    newTail.next = null;
    return newHead;
  }
}
