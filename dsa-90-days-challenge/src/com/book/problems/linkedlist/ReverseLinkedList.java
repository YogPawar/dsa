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
   // Node reverseNode = reverseList(linkedList.getHead());
   // System.out.println(reverseNode);

    Node reverse = reversePractice(linkedList.getHead());
    System.out.println(reverse);

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


  private static Node reversePractice(Node head) {
    Node previous = null;
    Node current = head;
    while (current != null) {
      //take temporary variable to point next of current
      Node next = current.getNext();
      //set current next = previous
      current.setNext(previous);
      //update previous
      previous = current;
      //update current
      current = next;
    }
    return previous;
  }
}
