package com.dsa.linkedlist;


public class LinkedList<T extends Comparable<T>> {

  Node<T> head;
  Node<T> tail;
  private int size;

  public LinkedList(T data) {
    Node<T> newNode = new Node<>(data);
    head = newNode;
    tail = newNode;
    size += 1;
  }

  public void prepend(T data) {
    Node<T> newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    size += 1;
  }


  public void append(T data) {
    Node<T> newNOde = new Node<>(data);
    if (tail == null) {
      newNOde = tail;
      head = newNOde;
    } else {
      tail.next = newNOde;
      tail = newNOde;
    }
    size += 1;

  }

  public int getSize() {
    return size;
  }

  public T getHead() {
    return head.data;
  }

  public T getTail() {
    return tail.data;
  }

  public void printList() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }
    Node<T> temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public void insertAtIndex(int index, T data) {
    if (index > size && index < 0) {
      System.out.println("Invalid index");
    } else if (index == 0) {
      prepend(data);
    } else if (index == size) {
      append(data);
    } else {
      Node<T> newNode = new Node<>(data);
      Node<T> positionNode = head;
      int postion = 0;
      while (postion < index - 1) {
        positionNode = positionNode.next;
        postion++;
      }
      newNode.next = positionNode.next;
      positionNode.next = newNode;
      size += 1;
    }
  }

  class Node<T extends Comparable<T>> {

    T data;
    Node<T> next;

    public Node(T data) {
      this.data = data;
    }

  }

}
