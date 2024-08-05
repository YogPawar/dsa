package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class PalindromeLinkedList {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(1);

    boolean isPalindrome = isListPalindrome(list.getHead());
    System.out.println("List is Palindrome : " + isPalindrome);
  }

  private static boolean isListPalindrome(Node head) {
    Node fastPointer = head;
    Node slowPointer = head;
    while (fastPointer != null && fastPointer.getNext() != null) {
      slowPointer = slowPointer.getNext();
      fastPointer = fastPointer.getNext().getNext();
    } //end of the loop slow pointer will reach to the middle of the LL.

    //reverse the half of the linked list
    Node previous = reverse(slowPointer);
    //compare reverse list with first half of the original list
    while (previous != null) {
      if (previous.getData() != head.getData()) {
        return false;
      }
      previous = previous.getNext();
      head = head.getNext();
    }
    return true;

  }

  private static Node reverse(Node head) {
    Node prev = null;
    Node current = head;
    while (current != null) {
      Node next = current.getNext();
      current.setNext(prev);
      prev = current;
      current = next;
    }
    return prev;
  }

}
