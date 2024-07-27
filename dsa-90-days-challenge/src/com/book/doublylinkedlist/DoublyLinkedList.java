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
    System.out.print("DLList : ");
    while (temp != null) {
      System.out.print(temp.getData() + " ");
      temp = temp.getNext();
    }
    System.out.println();
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

  public DLLNode deleteFirst() {
    if (head == null) {
      return null;
    }
    DLLNode nodeToDelete = head;
    head = nodeToDelete.getNext();
    head.setPrev(null);
    nodeToDelete.setNext(null);
    size -= 1;
    return nodeToDelete;
  }

  public DLLNode deleteLast() {
    if (head == null) {
      return null;
    }
    DLLNode nodeToDelete = head;
    while (nodeToDelete.getNext() != null) { //terminate once reach to last node
      nodeToDelete = nodeToDelete.getNext();
    }
    DLLNode previous = nodeToDelete.getPrev();
    nodeToDelete.setPrev(null); //remove the previous connection
    previous.setNext(null); //remove next connection
    size -= 1;
    return nodeToDelete;
  }

  /**
   * Delete the intermediate element
   *
   * @param data
   * @return
   */
  public DLLNode findAndDelete(int data) {
    if (head == null) {
      return null;
    } else if (head.getData() == data) {
      return deleteFirst();
    } else {
      DLLNode nodeToDelete = head;
      while (nodeToDelete.getNext() != null) { //traverse till last element
        if (nodeToDelete.getData() == data) {
          nodeToDelete.getPrev().setNext(nodeToDelete.getNext());
          nodeToDelete.getNext().setPrev(nodeToDelete.getPrev());
          nodeToDelete.setPrev(null);
          nodeToDelete.setNext(null);
          size -= 1;
          return nodeToDelete;
        }
        nodeToDelete = nodeToDelete.getNext();
      }
      if (nodeToDelete.getData() == data) {
        return deleteLast();
      }
    }
    return null;
  }
}
