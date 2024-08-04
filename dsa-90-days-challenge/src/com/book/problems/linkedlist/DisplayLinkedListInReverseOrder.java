package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class DisplayLinkedListInReverseOrder {

  /**
   * TC : O(n) for scanning the list SC :o(n) for call stack
   *
   * @param head
   */
  private static void print(Node head) {
    if (head == null) {
      return;
    }
    print(head.getNext());
    System.out.print(head.getData() + " ");
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(2);
    ll.add(3);
    ll.add(4);
    print(ll.getHead());

  }

}
