package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class FindNthNodeRecursion {

  static int counter = -1;


  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.add(50);

    System.out.println(findNthNode(ll.getHead(), 1));
    System.out.println(revreseList(ll.getHead()));
    printList(ll.getHead());
  }

  private static Node findNthNode(Node head, int i) {
    if (head == null) {
      return null;
    }
    Node result = findNthNode(head.getNext(), i);
    counter++;
    if (i == counter) {
      return head;
    }
    return result;
  }

  private static Node printList(Node head) {
    if (head == null) {
      return head;
    }
    System.out.print(head.getData() + " ");
    return printList(head.getNext());
  }

  private static Node revreseList(Node head) {
    if (head != null && head.getNext() != null) {
      return head;
    }
    Node newHead = revreseList(head.getNext());
    head = head.getNext().getNext();
    head.setNext(null);
    return newHead;
  }
}
