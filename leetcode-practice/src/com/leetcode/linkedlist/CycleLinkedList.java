package com.leetcode.linkedlist;


import com.leetcode.util.LinkedList;

public class CycleLinkedList {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(20);
    ll.append(15);
    ll.append(10);
    ll.append(5);
    ll.append(16);

    System.out.println(ll.isCycle());
  }

}
