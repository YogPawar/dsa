package com.book.linkedlist;

public class ListRunner {

  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.append(3);
    ll.append(10);
    ll.append(11);
    ll.append(12);
    ll.append(13);
    ll.append(14);
    ll.append(15);
    ll.printList();
    System.out.println();
    System.out.println("Head : " + ll.getHead());
    System.out.println("Tail : " + ll.getTail());
    System.out.println("Length of LL : " + ll.getSize());

    ll.remove(14);
    System.out.println();
    ll.printList();
    System.out.println("Head : " + ll.getHead());
    System.out.println("Tail : " + ll.getTail());
    System.out.println("Length of LL : " + ll.getSize());
  }
}