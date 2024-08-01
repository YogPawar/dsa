package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;
import java.awt.image.Kernel;
import java.util.HashMap;

public class FindNtheNodeHashTable {

  private static Integer findNthElement(LinkedList linkedList, int poistion) {
    HashMap<Integer, Node> hashMap = new HashMap<>();

    Node temp = linkedList.getHead();
    int index = 0;
    while (temp != null) {
      hashMap.put(index, temp);
      temp = temp.getNext();
      index++;
    }

    int nthPosition = hashMap.size() - poistion;
    Node nof = hashMap.get(nthPosition - 1);

    return nof.getData();
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    linkedList.add(40);
    linkedList.add(50);
    linkedList.add(60);

    System.out.println(findNthElement(linkedList, 2));

  }

}
