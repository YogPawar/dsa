package com.book.doublylinkedlist;

public class DLLRunner {

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList(5);
    dll.insertAtEnd(6);
    dll.insertAtEnd(7);
    dll.insertAtEnd(8);
    dll.insertAtEnd(9);
    System.out.println("Head : " + dll.getHead());
    System.out.println("Size : " + dll.getSize());
    dll.printDLL();

    System.out.println("Find and Delete");
    System.out.println(dll.findAndDelete(9));
    dll.printDLL();
    System.out.println("Head : " + dll.getHead());
    System.out.println("Size : " + dll.getSize());
  }

}
