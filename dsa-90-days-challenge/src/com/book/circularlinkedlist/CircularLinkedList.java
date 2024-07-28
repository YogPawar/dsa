package com.book.circularlinkedlist;

import org.w3c.dom.Node;

public class CircularLinkedList {

  private CLLNode head;
  private int length;

  public CircularLinkedList() {
    head = null;
  }

  public void add(int data) {
    addToHead(data);
  }

  private void addToHead(int data) {
    CLLNode newNode = new CLLNode(data);
    newNode.setNext(head);

    if (head != null) {
      CLLNode temp = head;
      while (temp.getNext() != head) {
        temp = temp.getNext();
      }
      temp.setNext(newNode);
    } else {
      newNode.setNext(newNode);
    }
    head = newNode;
    length++;


  }

  public void addToTail(int data) {
    addToHead(data);
    head = head.getNext();
  }

  public void printList() {
    CLLNode traverse = head;
    if (head != null) {
      do {
        System.out.print(traverse.getData() + " ");
        traverse = traverse.getNext();
      } while (traverse != head);
    }
  }



  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }
}
