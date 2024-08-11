package com.revision.ds;

import java.util.HashMap;

public class SinglyLinkedList<T> {

  private int length;
  private Node head;

  {
    System.out.println("List is Empty");
  }

  public SinglyLinkedList() {
    length = 0;
    head = null;
  }

  public SinglyLinkedList(T data) {
    Node newNode = new Node(data);
    head = newNode;
    length++;
  }

  public void add(T data) {
    Node newNode = new Node(data);
    if (head != null) {
      Node temp = head;
      while (temp.getNext() != null) {
        temp = temp.getNext();
      }
      temp.setNext(newNode);
    } else {
      head = newNode;
    }
    length++;
  }

  public void printList() {
    if (head != null) {
      Node temp = head;
      System.out.print("[ Head --> ");
      while (temp != null) {
        System.out.print(temp.getData() + ", ");
        temp = temp.getNext();
      }
      System.out.print(" ]");
      System.out.println();
    } else {
      System.out.println("List is empty.");
    }
  }

  public void addFirst(T data) {
    Node newNode = new Node(data);
    if (head != null) {
      Node temp = head;
      newNode.setNext(temp);
      head = newNode;
      length++;
    } else {
      add(data);
    }
  }

  public void addLast(T data) {
    add(data);
  }

  public Node<T> remove() {
    if (head != null) {
      Node temp = head;
      while (temp.getNext().getNext() != null) {
        temp = temp.getNext();
      }
      Node nodeToRemove = temp.getNext();
      temp.setNext(null);
      length--;
      return nodeToRemove;
    } else {
      System.out.println("List is empty");
      return null;
    }
  }

  public Node removeLast() {
    return remove();
  }

  public void clear() {
    head = null;
    length = 0;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public Node removeFirst() {
    Node temp = head;
    if (temp != null) {
      head = temp.getNext();
      temp.setNext(null);
      length--;
    } else {
      return null;
    }
    return temp;
  }

  public Node remove(T data) {
    if (head != null) {
      if (head.getData() == data) {
        return removeFirst();
      } else {
        Node previous = head.getNext();
        Node temp = head;
        //traverse and find the node to delete.
        while (temp != null) {
          if (temp.getData() == data) {
            previous.setNext(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
          }
          previous = temp;
          temp = temp.getNext();
        }
        System.out.println("Element not present in lest to Delete");
      }
    } else {
      System.out.println("List is empty");
    }
    return null;
  }

  public Node<Integer> removAt(int index) {
    HashMap<Integer, Node> listMap = new HashMap<>();
    Node temp = head;
    if (temp != null) {
      if (index == 0) {
        return removeFirst();
      } else {
        int i = 0;
        while (temp != null) {
          listMap.put(i, temp);
          temp = temp.getNext();
          i++;
        }
        if (index < i || index < 0) {
          Node nodeToDelete = listMap.get(index);
          Node previous = listMap.get(index - 1);
          previous.setNext(nodeToDelete.getNext());
          nodeToDelete.setNext(null);
          length--;
          return nodeToDelete;
        } else {
          System.out.println("Invalid index ");
          return null;
        }
      }
    }
    return null;
  }
}

