package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class FindMiddleOfLLTwoPointer {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.add(2);
    list.add(3);
    list.add(4);
    list.add(45);
    list.add(7);
    list.add(8);

    Node middleNode = findMiddle(list.getHead());
    System.out.println(middleNode);
  }

  private static Node findMiddle(Node head) {
    Node slowPointer = head;
    Node fastPointer = head;
    while (fastPointer != null && fastPointer.getNext() != null) {
      fastPointer = fastPointer.getNext().getNext();
      slowPointer = slowPointer.getNext();
    }
    slowPointer.setNext(null); //removing the link with next element
    return slowPointer;
  }

}
