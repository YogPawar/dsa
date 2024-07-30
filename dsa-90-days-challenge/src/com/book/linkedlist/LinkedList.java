package com.book.linkedlist;


public class LinkedList<T extends Comparable<T>> {

  Node<T> head;
  Node<T> tail;
  private int size;

  public LinkedList() {

  }

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
    Node<T> newNode = new Node<>(data);
    if (tail == null) {
      tail = newNode;
      head = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size += 1;

  }

  public int getSize() {
    return size;
  }

  public T getHead() {
    return head.data;
  }

  public Node<T> head() {
    return head;
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

  public Node<T> removeFromBegin() {
    Node<T> node = head;
    if (node != null) {
      head = node.next;
      node.next = null;
      size -= 1;
    }

    return node;
  }

  public Node<T> removeFromEnd() {
    Node<T> node = head;
    Node<T> previous = node;
    while (node.next != null) {
      previous = node;
      node = node.next;
    }
    previous.next = null;
    tail = previous;
    size -= 1;
    return node;
  }

  public Node<T> remove(T data) {
    if (head.data == data) {
      removeFromBegin();
    } else if (tail.data == data) {
      removeFromEnd();
    } else {
      Node<T> previous = head;
      Node<T> next = head.next;
      while (next != null) {
        if (next.data == data) {
          previous.next = next.next;
          next.next = null;
          size--;
          return next;
        }
        previous = next;
        next = next.next;

      }
    }
    return null;
  }
}
