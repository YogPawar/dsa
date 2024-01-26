package com.misc.sorting.selection.solution;


import com.misc.sorting.selection.solution.LinkedList;

public class Main {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(56);
    ll.append(5);
    ll.append(45);
    ll.append(2);
    ll.append(46);
    ll.append(8);
    System.out.println("unsorted List ");
    ll.printList();

    System.out.println("Sorted List");
    ll.selectionSort();
    ll.printList();
  }

}
