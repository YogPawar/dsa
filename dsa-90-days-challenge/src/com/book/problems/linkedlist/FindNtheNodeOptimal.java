package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class FindNtheNodeOptimal {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.add(50);

    System.out.println(findNthNode(ll, 1));

  }

  private static Node findNthNode(LinkedList list, int nThNode) {
    Node findPosition = list.getHead();
    System.out.println(list.getHead());
    Node nthNode = null;
    for (int count = 0; count < nThNode; count++) {
      findPosition = findPosition.getNext();
    }

    while (findPosition != null) {
      if (nthNode == null) {
        nthNode = list.getHead();
      } else {
        nthNode = nthNode.getNext();
      }
      findPosition = findPosition.getNext();
    }

    return nthNode;
  }

}
