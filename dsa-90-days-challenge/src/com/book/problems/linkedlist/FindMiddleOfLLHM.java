package com.book.problems.linkedlist;


import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;
import java.util.HashMap;

public class FindMiddleOfLLHM {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.add(2);
    linkedList.add(5);
    linkedList.add(6);
    linkedList.add(8);
    linkedList.add(10);

    Node middle = findMiddle(linkedList.getHead());
    System.out.println(middle);
  }

  /**
   * TC : O(n) for creating and scanning the list.
   * <p>SC : O(n) for storing the nodes in List.
   *
   * @param head
   * @return
   */
  private static Node findMiddle(Node head) {
    HashMap<Integer, Node> linkeMap = new HashMap<>();
    Node temp = head;
    int index = 0;
    while (temp != null) {
      linkeMap.put(index, temp);
      temp = temp.getNext();
      index++;
    }
    int middle = index / 2;
    return linkeMap.get(middle);
  }

}
