package com.revision.ds;

public class SinglyLinkedListRunner {

  public static void main(String[] args) {
    SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
    ll.add(4);
    ll.add(6);
    ll.add(7);
    ll.add(8);
    ll.printList();
    ll.removAt(5);
    ll.printList();


  }

}
