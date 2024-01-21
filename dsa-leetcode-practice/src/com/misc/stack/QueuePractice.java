package com.misc.stack;

public class QueuePractice {

  Node first;
  Node last;
  int length;


  QueuePractice(int value) {
    Node newNode = new Node(value);
    first = newNode;
    last = newNode;
    length++;
  }

  class Node {

    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public void show() {
    Node temp = first;
    while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }

  public void enqueue(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      first = newNode;
      last = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
    length++;
  }

  public Node dequeue() {
    if (length == 0) {
      return null;
    }
    Node temp = first;
    first = temp.next;
    temp.next = null;
    return temp;
  }

  public void getFirst() {
    if (first != null) {
      System.out.println("First : " + first.value);
    }
  }

  public void getLast() {
    if (last != null) {
      System.out.println("Last : "
          + "" + last.value);
    }
  }

  public static void main(String[] args) {
    QueuePractice queue = new QueuePractice(5);
    queue.enqueue
        (6);
    queue.enqueue(8);
    queue.enqueue(50);
    queue.getFirst();
    System.out.println("Remove first : " + queue.dequeue().value);
    queue.getFirst();
    queue.show();
  }
}
