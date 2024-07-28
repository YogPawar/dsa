package com.book.circularlinkedlist;

public class CLLRunner {

  public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();
    cll.add(10);
    cll.add(12);
    cll.add(13);

    System.out.println("List : ");
    cll.printList();
  }

}
