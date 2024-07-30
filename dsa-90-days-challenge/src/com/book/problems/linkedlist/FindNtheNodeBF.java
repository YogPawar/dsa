package com.book.problems.linkedlist;

import com.book.linkedlist.LinkedList;
import com.book.linkedlist.Node;

public class FindNtheNodeBF {

  private static int findNthElement(LinkedList<Integer> linkedList, int poistion) {
    Node<Integer> temp = linkedList.head();
    int size = 0;
    while (temp != null) {
      size += 1;
      temp = temp.getNext();
    }
    if (poistion > size) {
      System.out.println("Invalid Position");
      return 0;
    }
    temp = linkedList.head();
    int findPosition = 0; // = size - poistion;
    while (findPosition < size - poistion) {
      temp = temp.getNext();
      findPosition++;
    }
    return temp.getData();
  }

  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.append(10);
    linkedList.append(20);
    linkedList.append(30);
    linkedList.append(40);
    linkedList.append(50);
    linkedList.append(60);

    System.out.println(findNthElement(linkedList, 10));

  }

}
