package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class ReverseLinkedList {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);

    System.out.println(linkedList.getHead());
    Node reverseNode = reverseList(linkedList.getHead());
    System.out.println(reverseNode);
  }

  /**
   * TC : O(n) for scanning the all list
   * <p>
   * SC: O(1)
   *
   * @param head
   * @return
   */
  private static Node reverseList(Node head) {
    Node revserseNode = null;
    Node currentNode = head;
    while (currentNode != null) {
      Node next = currentNode.getNext();
      currentNode.setNext(revserseNode);
      revserseNode = currentNode;
      currentNode = next;

    }
    return revserseNode;
  }

}
