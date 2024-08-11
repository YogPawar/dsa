package com.revision.ds;

public class DoublyLinkedListRunner {

  public static void main(String[] args) {
    DubblyLinkedList dll = new DubblyLinkedList(4);
    dll.add(6);
    dll.add(7);
    dll.add(8);
    System.out.println(dll.head.data);
    //dll.printList();
  }

}
