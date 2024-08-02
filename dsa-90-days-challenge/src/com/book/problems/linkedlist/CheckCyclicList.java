package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.Node;
import java.util.HashMap;

public class CheckCyclicList {

  /**
   * TC: O(n) for scanning the list.
   * <p>
   * SC O(n) to store the address in hashmap
   *
   * @param head
   * @return
   */
  private boolean isCyclic(Node head) {
    HashMap<Node, Boolean> addressMap = new HashMap<>();
    Node temp = head;
    while (temp != null) {
      if (addressMap.containsKey(temp)) {
        return false;
      } else {
        addressMap.put(temp, true);
      }
      temp = temp.getNext();
    }
    return true;
  }

  public boolean isCyclicUsingTwoPointer(Node head) {
    Node slowPointer = head;
    Node fastPointer = head;

    while (fastPointer != null && fastPointer.getNext() != null) {
      slowPointer = slowPointer.getNext();
      fastPointer = fastPointer.getNext().getNext();
      if (slowPointer == fastPointer) {
        return true;
      }
    }
    return false;
  }
}
