package com.misc.dublyllist;

import com.misc.dublyllist.DublyLinkedList.Node;
import java.sql.SQLOutput;

public class DublyMain {

  public static void main(String[] args) {
    DublyLinkedList dublyLinkedList = new DublyLinkedList(5);
    dublyLinkedList.getLength();
    dublyLinkedList.getHead();
    dublyLinkedList.getTail();
    dublyLinkedList.printList();

    System.out.println("*******************Append****************************");
    dublyLinkedList.append(4);
    dublyLinkedList.printList();
    System.out.println("*******************Remove Last****************************");
    dublyLinkedList.append(56);
    dublyLinkedList.printList();
    dublyLinkedList.getTail();
    System.out.println("Removed element is: " + dublyLinkedList.removeLast().value);

    System.out.println("*******************Prepend****************************");

    dublyLinkedList.prepend(78);
    dublyLinkedList.printList();
    System.out.println("*******************Remove First****************************");
    dublyLinkedList.removeFirst();
    dublyLinkedList.printList();
    System.out.println("*******************Get****************************");
    System.out.println(dublyLinkedList.get(0).value);
    System.out.println(dublyLinkedList.get(4));
    System.out.println("*******************Set****************************");
    dublyLinkedList.set(0, 4);
    dublyLinkedList.printList();
    System.out.println("*******************Insert****************************");
    dublyLinkedList.printList();
    dublyLinkedList.insert(2, 1000);
    dublyLinkedList.printList();
    System.out.println("*******************Remove****************************");

    dublyLinkedList.printList();
    dublyLinkedList.remove(1);
    dublyLinkedList.printList();


  }

}


