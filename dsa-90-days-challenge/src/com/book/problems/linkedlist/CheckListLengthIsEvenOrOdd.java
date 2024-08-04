package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class CheckListLengthIsEvenOrOdd {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(6);
    String lengthType = checkLength(ll.getHead());
    System.out.println(lengthType);
  }

  private static String checkLength(Node head) {
    Node lengthChecker = head;
    while (lengthChecker != null && lengthChecker.getNext() != null) {
      lengthChecker = lengthChecker.getNext().getNext();
    }

    return lengthChecker == null ? "even" : "odd";

  }

}
