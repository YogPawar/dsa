package com.book.reviesion.linkedlist;

public class LinkedList {

  private Node head;
  private int size;

  //default constructor
  public LinkedList() {
  }

  public LinkedList(int data) {
    head = new Node(data);
    size++;
  }

  public void add(int data) {
    Node newNode = new Node(data);
    if (head != null) {
      Node temp = head;
      while (temp.getNext() != null) { //traverse till last node
        temp = temp.getNext();
      }
      temp.setNext(newNode);
    } else {
      head = newNode;
    }
    size++;
  }

  public void addFirst(int data) {
    //create a new node
    Node newNode = new Node(data);
    //if list is not empty then add to first node and move head pointer to new node
    if (head != null) {
      Node temp = head;
      newNode.setNext(temp);
      head = newNode;
    } else {
      //else set head to new node.
      head = newNode;
    }
    size++;
  }

  public void addLast(int data) {
    add(data);
  }

  public void add(int index, int data) {
    //create a node
    if (index > size || index < -1) {
      System.out.println("Invalid index");
    } else {
      if (index == 0) {
        addFirst(data);
      } else if (index == size - 1) {
        addLast(data);
      } else {
        Node newNode = new Node(data);
        Node temp = head;
        Node previousNode = temp;
        int k = 0;
        while (k != index) {
          previousNode = temp;
          temp = temp.getNext();
          k++;
        }
        previousNode.setNext(newNode);
        newNode.setNext(temp);
        size++;
      }
    }
  }

  //lets play with removing the data

  /**
   * Remove the last node from the list
   *
   * @return removed node
   */
  public Node removeFirst() {
    if (head == null) {
      return null;
    } else {
      Node nodeToRemove = head;
      head = nodeToRemove.getNext();
      nodeToRemove.setNext(null);
      size--;
      return nodeToRemove;
    }
  }

  public Node removeLast() {
    if (isEmpty()) {
      return null;
    } else if (size == 1) {
      return removeFirst();
    } else {
      //traverse to the last node
      Node nodeToDelete = head;
      Node previousNode = head;
      while (nodeToDelete.getNext() != null) {
        previousNode = nodeToDelete;
        nodeToDelete = nodeToDelete.getNext();
      }
      previousNode.setNext(null);
      size--;
      return nodeToDelete;
    }
  }

  public Node removeAt(int index) {
    if (index < 0 || index >= size) {
      System.out.println("Invalid Index");
      return null;
    } else if (index == 0) {
      return removeFirst();
    } else if (index == size - 1) {
      return removeLast();
    } else {
      int k = 0;
      Node nodeToDelete = head;
      Node previous = head;
      while (k != index) {
        previous = nodeToDelete;
        nodeToDelete = nodeToDelete.getNext();
        k++;
      }
      previous.setNext(nodeToDelete.getNext());
      nodeToDelete.setNext(null);
      size--;
      return nodeToDelete;
    }
  }

  public void printList() {
    if (!isEmpty()) {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.getData() + " ");
        temp = temp.getNext();
      }
      System.out.println();
    } else {
      System.out.println("List is empty");
    }
  }

  public Node getHead() {
    return this.head;
  }

  public int getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void clear() {
    head = null;
    size = 0;
  }
}
