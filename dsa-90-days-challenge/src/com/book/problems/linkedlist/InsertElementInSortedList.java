package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class InsertElementInSortedList {

  private static Node insert(Node head, int data) {
    Node current = head;
    Node newNode = new Node(data);

    if (head == null) {
      return newNode;
    }

    if (head.getData() > newNode.getData()) {
      newNode.setNext(head);
      return newNode;
    }

    Node previous = head;
    while (current != null && current.getData() < newNode.getData()) {
      previous = current;
      current = current.getNext();
    }
    newNode.setNext(current);
    previous.setNext(newNode);
    return head;
  }

  public static void main(String[] args) {
    LinkedList sorteList = new LinkedList();
    sorteList.add(2);
    sorteList.add(3);
    sorteList.add(5);
    sorteList.add(6);

    Node head = insert(sorteList.getHead(), 1);
    System.out.println(head);

    Node head2 = insert(sorteList.getHead(), 4);
    System.out.println(head);

    Node head3 = insert(sorteList.getHead(), 10);
    System.out.println(head);


  }

}
