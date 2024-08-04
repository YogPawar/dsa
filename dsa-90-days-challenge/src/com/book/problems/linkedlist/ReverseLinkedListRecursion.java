package com.book.problems.linkedlist;

import com.book.reviesion.linkedlist.LinkedList;
import com.book.reviesion.linkedlist.Node;
import java.util.Stack;

public class ReverseLinkedListRecursion {

  Node reverse = null;

  /**
   * TC : O(m + n) scanning the both list
   * <p> SC : O (m + n) creating a stack for both list</p>
   *
   * @param head1
   * @param head2
   * @return
   */
  private static Node intersectionNode(Node head1, Node head2) {
    Stack<Node> headOneStack = new Stack<>();
    Stack<Node> headTwoStack = new Stack<>();
    Node tempHaead = head1;
    while (tempHaead != null) { //O(m)
      headOneStack.push(tempHaead);
      tempHaead = tempHaead.getNext();
    }
    tempHaead = head2;
    while (tempHaead != null) { //O(m)
      headTwoStack.push(tempHaead);
      tempHaead = tempHaead.getNext();
    }

    while (!headOneStack.isEmpty()) { //O(n)
      Node intersect = headOneStack.pop();
      if (headTwoStack.contains(intersect)) {
        return intersect;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    System.out.println(ll.getHead());
    Node reverese = reverse(ll.getHead());
    System.out.println(reverese);
  }

  private static Node reverse(Node head) {
    if (head == null || head.getNext() == null) {
      return head;
    }
    Node newHead = reverse(head.getNext());
    Node headNext = head.getNext();
    headNext.setNext(head);
    head.setNext(null);
    return newHead;
  }

}
