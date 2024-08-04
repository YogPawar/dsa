package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.Node;

public class TwoLLIntersectionPointOptimize {

  /**
   * TC : O(max(m,n)
   * SC : O(1)
   * @param headOne
   * @param headTwo
   * @return
   */
  private Node interectionNode(Node headOne, Node headTwo) {
    int headOneLength = 0;
    int headTwoLength = 0;
    int diff = 0;
    Node headOneTemp = headOne;
    Node headTwoTemp = headTwo;
    while (headOneTemp != null) {
      headOneLength++;
      headOneTemp = headOneTemp.getNext();
    }

    while (headTwoTemp != null) {
      headTwoLength++;
      headTwoTemp = headTwoTemp.getNext();
    }

    if (headOneLength < headTwoLength) {
      headOneTemp = headTwo;
      headTwoTemp = headOne;
      diff = headTwoLength - headOneLength;
    } else {
      headOneTemp = headOne;
      headTwoTemp = headTwo;
      diff = headOneLength - headTwoLength;
    }

    //iterated the longest list till diff
    int index = 0;
    while (index < diff) {
      headOneTemp = headOneTemp.getNext();
      index++;
    }

    //iterate the both list and check if we found the match node.
    while (headOneTemp != null && headTwoTemp != null) {
      if (headOneTemp == headTwoTemp) {
        return headOneTemp;
      }
      headOneTemp = headOneTemp.getNext();
      headTwoTemp = headTwoTemp.getNext();
    }
    return null;
  }
}
