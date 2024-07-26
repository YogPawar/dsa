package com.book.doublylinkedlist;

public class DLLRunner {

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList(5);
    dll.insertAtBegin(6);

    dll.printDLL();
  }

}
