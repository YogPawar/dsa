package com.leetcode.linkedlist;

public class ListNodeMain {

  public static void main(String[] args) {
    ListNode linkeList = new ListNode(1);
    linkeList.insert(2);
    linkeList.insert(3);
    linkeList.insert(4);
    linkeList.insert(5);
    linkeList.insert(6);

    linkeList.printList();

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode reveste = reverseLinkedList.reverseList(linkeList.get());
    System.out.println(reveste.val);
  }


}
