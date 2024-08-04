package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class MergeTwoSortedListRecursion {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(2);
    ll.add(3);
    ll.add(4);

    LinkedList l2 = new LinkedList();
    l2.add(1);
    l2.add(2);
    l2.add(5);
    Node mergeList = merge(ll.getHead(), l2.getHead());
    System.out.println(mergeList);

  }

  private static Node merge(Node head1, Node head2) {
    if (head1 == null) {
      return head2;
    }
    if (head2 == null) {
      return head1;
    }
    Node head = new Node(0);
    if (head1.getData() <= head2.getData()) {
      head = head1;
      head.setNext(merge(head1.getNext(), head2));
    } else {
      head = head2;
      head.setNext(merge(head2.getNext(), head1));
    }
    return head;
  }


}
