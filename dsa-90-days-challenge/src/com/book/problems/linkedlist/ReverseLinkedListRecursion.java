package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class ReverseLinkedListRecursion {

  Node reverse = null;

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    System.out.println(ll.getHead());
    Node reverese = reverse(ll.getHead());
    System.out.println(reverese);
  }

  private static Node reverse(Node head) {
    if (head == null || head.getNext() == null) {
      return head;
    }
    Node newHead = reverse(head.getNext());
    Node headNext = head.getNext();
    headNext.setNext(head);
    head.setNext(null);
    return newHead;
  }

}
