package com.dsa.linkedlist;

public class PalindromeList {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next = new ListNode(1);

    System.out.println(isPalindrome(head));
    System.out.println(head);
  }


  private static boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode reverseSecondHalf = reverse(slow);

    ListNode firstHalf = head;
    ListNode secondHalf = reverseSecondHalf;
    while (secondHalf != null) {
      if (firstHalf.val != secondHalf.val) {
        return false;
      }
      secondHalf = secondHalf.next;
      firstHalf = firstHalf.next;
    }
    return true;
  }

  private static ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
}


