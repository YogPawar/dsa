package com.book.reviesion.linkedlist;

public class Runner {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addLast(500);
    ll.add(3);
    ll.add(5);
    ll.add(7);
    ll.add(6);
    ll.clear();
    ll.printList();
    System.out.println(ll.getSize());

  }

}
