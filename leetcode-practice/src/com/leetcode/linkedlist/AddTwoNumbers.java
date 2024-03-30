package com.leetcode.linkedlist;

import com.leetcode.util.LinkedList;
import com.leetcode.util.LinkedList.Node;

public class AddTwoNumbers {

  public static void main(String[] args) {
    LinkedList l1 = new LinkedList(2);
    l1.append(4);
    l1.append(3);
    l1.printlist();

    LinkedList l2 = new LinkedList(7);
    l2.append(0);
    l2.append(8);

    Node no = l2.addTwoList(l1, l2);
    while (no != null){
      System.out.println(no.value);
      no = no.next;
    }
  }


}
