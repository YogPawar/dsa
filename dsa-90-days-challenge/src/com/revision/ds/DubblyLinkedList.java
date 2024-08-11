package com.revision.ds;

public class DubblyLinkedList {

  DLNode head;
  int size;

  public DubblyLinkedList() {

  }

  public DubblyLinkedList(int data) {
    DLNode newNode = new DLNode(data);
    head = newNode;
    size++;
  }

  public void add(int data) {
    DLNode newNode = new DLNode(data);
    if (head != null) {
      DLNode temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      newNode.prev = temp;
      temp.next = newNode;
    } else {
      head = newNode;
    }
    size++;
  }

  public void printList() {
    DLNode itr = head;
    if (itr == null) {
      System.out.println("List is empty");
      return;
    }
    System.out.print("[ ");
    while (itr != null) {
      System.out.print(itr.data + " ");
      itr = itr.next;
    }
    System.out.print("]");
    System.out.println();
  }

  class DLNode {

    int data;
    DLNode next;
    DLNode prev;

    DLNode(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }

    @Override
    public String toString() {
      return "DLNode{" +
          "data=" + data +
          ", next=" + next +
          ", prev=" + prev +
          '}';
    }
  }

}
