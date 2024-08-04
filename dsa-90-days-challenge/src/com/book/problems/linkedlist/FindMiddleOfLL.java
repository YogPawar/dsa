package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;

public class FindMiddleOfLL {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.add(2);
    list.add(3);
    list.add(4);
    list.add(45);
    list.add(7);

    Node middleNode = findMiddle(list.getHead());
    System.out.println(middleNode);
  }

  /**
   * TC : O(n) for scanning the element and O(n/2) for searching the middle. i.e O(n)
   * <p>
   * SC : O(1)
   *
   * @param head
   * @return
   */
  private static Node findMiddle(Node head) {
    int length = 0;
    Node temp = head;
    if (temp != null) {
      while (temp != null) {
        length++;
        temp = temp.getNext();
      }
      int mid = length / 2;
      int index = 0;
      temp = head;
      while (index < mid) {
        temp = temp.getNext();
        index++;
      }
      temp.setNext(
          null); //returning only middle node else it would return the half ll from middle
      return temp;
    }
    return null;
  }

}
