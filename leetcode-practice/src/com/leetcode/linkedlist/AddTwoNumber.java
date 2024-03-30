package com.leetcode.linkedlist;

public class AddTwoNumber {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1 = new ListNode(5);
    l1.next.val = 4;
    l1.next.next.val = 3;

    ListNode l2 = new ListNode(5);
    l2.next.val = 6;
    l2.next.next.val = 4;

    AddTwoNumber addTwoNumber = new AddTwoNumber();
    ListNode result = addTwoNumber.add(l1, l2);
    while (result != null) {
      System.out.print(result.val + " ");
      result = result.next;
    }
  }

  public ListNode add(ListNode l1, ListNode l2) {
    ListNode dummyNode = new ListNode(0); ///create the dummy node
    ListNode tail = dummyNode;

    int reminder = 0;

    while (l1 != null || l2 != null || reminder != 0) {
      int digit1 = (l1 != null) ? l1.val : 0;
      int digit2 = (l2 != null) ? l2.val : 0;

      int sum = digit1 + digit2 + reminder;
      int digit = sum % 10;  //last digit of sum
      reminder = sum / 10; // first digit

      ListNode newNode = new ListNode(digit);
      tail.next = newNode;
      tail = tail.next;

      l1 = (l1 != null) ? l1.next : null;
      l2 = (l2 != null) ? l2.next : null;
    }

    ListNode result = dummyNode.next;
    dummyNode.next = null;
    return result;
  }

}
