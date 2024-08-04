package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class MergeTwoSortedListIterative {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(1);
    ll.add(2);
    ll.add(3);

    LinkedList l2 = new LinkedList();
    l2.add(4);
    l2.add(5);
    l2.add(6);
    Node mergeList = merge(ll.getHead(), l2.getHead());
    System.out.println(mergeList);

  }

  private static Node merge(Node head1, Node head2) {
    Node head = new Node(0);
    Node current = head;
    /* both list should have value
     <p> so we can compare with each other*/
    while (head1 != null && head2 != null) {
      //compare the both list and store the lowest element into reverse node.
      if (head1.getData() <= head2.getData()) {
        current.setNext(head1);
        head1 = head1.getNext();
      } else {
        current.setNext(head2);
        head2 = head2.getNext();
      }
      current = current.getNext();
    }

    if (head1 != null) {
      current.setNext(head1);
    } else if (head2 != null) {
      current.setNext(head2);
    }
    return head.getNext();
  }

}
