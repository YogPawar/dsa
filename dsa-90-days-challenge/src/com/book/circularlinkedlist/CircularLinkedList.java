package com.book.circularlinkedlist;

import javax.print.DocFlavor.READER;
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

  public int removeFirst() {
    if (head == null) {
      return 0;
    } else {
      CLLNode tail = head;
      CLLNode nodeToDelete = head;
      //find the last element
      while (tail.getNext() != head) {
        tail = tail.getNext();
      }
      tail.setNext(nodeToDelete.getNext());
      head = nodeToDelete.getNext();
      nodeToDelete.setNext(null);
      length--;
      if (length <= 0) {
        head = null;
      }
      return nodeToDelete.getData();
    }
  }

  public int removeLast() {
    CLLNode nodeToDelete = head;
    CLLNode nodePTail = head;

    if (nodeToDelete == nodeToDelete.getNext()) { //list having only one element
      head = null;
      length--;
      return nodePTail.getData();
    } else {
      while (nodeToDelete.getNext() != head) {
        if (nodeToDelete.getNext().getNext() == head) {
          nodePTail = nodeToDelete;
        }
        nodeToDelete = nodeToDelete.getNext();
      }
      nodePTail.setNext(nodeToDelete.getNext());
      nodeToDelete.setNext(null);
      length--;
    }
    return nodeToDelete.getData();
  }

  public void printList() {
    CLLNode traverse = head;
    if (traverse != null) {
      do {
        System.out.print(traverse.getData() + " ");
        traverse = traverse.getNext();
      } while (traverse != head);
    }
  }

  public void printcll() {
    int i = 0;
    CLLNode traverse = head;
    while (i < length) {
      System.out.print(traverse.getData() + " ");
      traverse = traverse.getNext();
      i += 1;
    }
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }
}
