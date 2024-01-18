package com.misc.linkedlist;

import java.sql.SQLOutput;

public class Main {

  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList(5);
    linkedList.append(4);
    linkedList.append(6);
    linkedList.getHead();
    linkedList.getTail();
    linkedList.getLength();
    System.out.println("=====================================");

    linkedList.printList();
    System.out.println("=====================================");

    System.out.println(linkedList.removeLast().value);

    System.out.println("List after remove the last element");

    linkedList.printList();
    System.out.println("=====================================");
    System.out.println("Prepend the List");
    linkedList.prepend(1);
    linkedList.printList();

    System.out.println("Remove first");
    System.out.println("Removed Item is : " + linkedList.removeFirst().value);
    linkedList.printList();
    System.out.println("=====================================");

    linkedList.append(8);
    linkedList.append(10);
    linkedList.printList();
    System.out.println("Get the element at specified index");
    System.out.println("Value at index :" + linkedList.get(3).value);
    System.out.println("=====================================");
    System.out.println("Change the value at index 3 : " + linkedList.set(3, 100));
    linkedList.printList();
    System.out.println("=====================================");
    System.out.println("Value at new 3 before insertion : " + linkedList.get(3).value);

    System.out.println(
        "Insert value at given index after insertion :  " + linkedList.insert(3, 50));
    System.out.println("Value at new 3 : " + linkedList.get(3).value);
    linkedList.printList();

    System.out.println("===========================================");
    System.out.println("Remove the element at index " + linkedList.remove(3));
    linkedList.printList();
    System.out.println("===========================================");
    System.out.println("Reverse the LL");
    linkedList.reverse();
    linkedList.printList();
    System.out.println("===========================================");


  }

}
