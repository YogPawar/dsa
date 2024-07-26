package com.book.doublylinkedlist;

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

  public void printDLL() {
    DLLNode temp = head;
    while (temp != null) {
      System.out.print(temp.getData() + " ");
      temp = temp.getNext();
    }
  }
}
