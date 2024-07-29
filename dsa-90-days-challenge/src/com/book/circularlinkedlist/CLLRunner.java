package com.book.circularlinkedlist;

public class CLLRunner {

  public static void main(String[] args) {
    CircularLinkedList cll = new CircularLinkedList();
    cll.add(10);
    cll.addToTail(5);
    cll.addToTail(35);
    cll.addToTail(25);
    cll.addToTail(15);
    cll.printList();

    System.out.println("\n Length : "+cll.getLength());
    System.out.println(cll.removeLast());
    cll.printList();
    System.out.println("\n Length : " + cll.getLength());
  }

}
