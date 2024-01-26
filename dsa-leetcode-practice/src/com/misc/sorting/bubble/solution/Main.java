package com.misc.sorting.bubble.solution;

public class Main {


  public static void main(String[] args) {
    LinkedList ll = new LinkedList(6);
    ll.append(37);
    ll.append(9);
    ll.append(13);
    ll.append(15);
    ll.append(3);

    System.out.println("Unsorted Linked List : ");
    ll.printList();

    System.out.println("Sorted Linked List : ");

    ll.bubbleSort();
    ll.printList();


  }


}
