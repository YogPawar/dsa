package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.Node;

/**
 * If there is a cycle in list the find the length of loop
 */
public class FindTheLengthOfLoop {

  private int lengthOfLoop(Node head) {
    Node slowPointer = head;
    Node fastPointer = head;
    boolean isCycle = false;

    while (fastPointer != null || fastPointer.getNext() != null) {

      slowPointer = slowPointer.getNext();
      fastPointer = fastPointer.getNext().getNext();
      if (slowPointer == fastPointer) {
        isCycle = true;
        break;
      }
    }
    int length = 0;
    if (isCycle) {
      do {
        slowPointer = slowPointer.getNext();
        length++;
      } while (slowPointer != fastPointer);
      return length;
    } else {
      return 0;
    }
  }

}
