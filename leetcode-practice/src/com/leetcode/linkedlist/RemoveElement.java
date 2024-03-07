package com.leetcode.linkedlist;

import com.leetcode.util.LinkedList;
import com.leetcode.util.LinkedList.Node;

public class RemoveElement {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(7);
    ll.append(77);
    ll.append(10);
    ll.append(12);
    ll.append(87);

  ll.reverseList();
    ll.printlist();
  }

}
