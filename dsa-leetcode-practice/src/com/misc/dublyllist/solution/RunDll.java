package com.misc.dublyllist.solution;

public class RunDll {

  public static void main(String[] args) {
    DublyLinkedList dl = new DublyLinkedList(6);
    dl.append(5);
    dl.append(8);
    dl.append(8);
    dl.append(5);
    dl.append(6);
    dl.swapFirstLast();
    System.out.println("Before swap");
    dl.printList();

    dl.swapPairs();
    System.out.println();
    System.out.println("After swap");
    dl.printList();

  }


}
