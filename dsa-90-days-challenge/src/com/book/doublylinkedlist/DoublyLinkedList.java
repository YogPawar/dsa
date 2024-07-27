package com.book.doublylinkedlist;

import org.w3c.dom.Node;

public class DoublyLinkedList {

  private DLLNode head;
  private int size;


  DoublyLinkedList(int data) {
    DLLNode newNode = new DLLNode(data);
    head = newNode;
    size++;
  }

  public void insertAtBegin(int data) {
    DLLNode newNode = new DLLNode(data);
    newNode.setNext(head);
    head.setPrev(newNode);
    newNode.setPrev(null);
    head = newNode;
    size++;
  }

  public void insertAtEnd(int data) {
    DLLNode newNode = new DLLNode(data);
    if (head == null) {
      head = newNode;
    } else {
      //traverse the list till end
      DLLNode temp = head;
      while (temp.getNext() != null) {
        temp = temp.getNext();
      }

      newNode.setPrev(temp);
      temp.setNext(newNode);
    }
    size++;
  }

  public void printDLL() {
    DLLNode temp = head;
    while (temp != null) {
      System.out.print(temp.getData() + " ");
      temp = temp.getNext();
    }
  }

  public int getHead() {
    return head.getData();
  }

  public void setHead(DLLNode head) {
    this.head = head;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
