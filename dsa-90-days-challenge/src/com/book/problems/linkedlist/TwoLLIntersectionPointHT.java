package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;
import java.util.HashMap;

public class TwoLLIntersectionPointHT {

  public static void main(String[] args) {
    LinkedList l1 = new LinkedList(10);
    l1.add(15);
    l1.add(25);
    l1.add(35);
    l1.add(45);
    LinkedList l2 = new LinkedList();
    l2.add(5);
    l2.add(12);
    l2.add(13);
    l2.add(17);

  }

  /**
   * This method using a hashmap to identity the intersection node.
   * <p>
   * TC : Time for creating the HashMap + scanning the second list = O(m) + O(n)
   * <p> oe(O(n) + o(m) depends on which list we select for creating the hash table.
   * <p> but in both case time complexity will be same.
   * <p> SC :  O(n) or O(m) depends on which list storing in HashMap
   *
   * @param head1
   * @param head2
   * @return
   */
  private static Node intersectionNode(Node head1, Node head2) {
    HashMap<Node, Integer> trackNodeMap = new HashMap<>();
    Node temp = head1;
    while (temp != null) { //O(n)
      trackNodeMap.put(temp, temp.getData());
      temp = temp.getNext();
    }
    temp = head2;
    while (temp != null) { //O(m)
      if (trackNodeMap.containsKey(temp)) {
        return temp;
      }
      temp = temp.getNext();
    }
    return null;
  }
}
