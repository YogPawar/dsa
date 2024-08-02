package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.Node;

public class StartNodeOfCycle {

  /**
   * TC : O(n) to traverse the list
   * <p>
   * SC : O(1)
   * <p>
   *
   * @param head
   * @return
   */
  private Node findLoopStartNode(Node head) {
    Node slowPointer = head;
    Node fastPointer = head;
    boolean isCyclic = false;

    while (fastPointer != null || fastPointer.getNext() != null) {
      slowPointer = slowPointer.getNext();
      fastPointer = fastPointer.getNext().getNext();
      if (slowPointer == fastPointer) {
        isCyclic = true;
        break;
      }
    }
    if (isCyclic) {
      slowPointer = head; //assign slowpointer to head
      while (slowPointer != fastPointer) {
        slowPointer = slowPointer.getNext();
        fastPointer = fastPointer.getNext();
      }
      return fastPointer;
    } else {
      return null;
    }
  }

}
