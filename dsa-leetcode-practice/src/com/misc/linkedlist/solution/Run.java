package com.misc.linkedlist.solution;

public class Run {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(5);

    ll.append(6);
    ll.append(7);
    ll.append(30);
    ll.append(68);
    ll.append(64);
    ll.append(86);
    ll.append(96);
    ll.append(46);

    ll.printList();

    System.out.println("Middle Element is : " + ll.findMiddleElement().value);
    System.out.println("Is LL has loop : " + ll.hasLoop());

    System.out.println(ll.findKthFromEnd(3).value);
  }

}
