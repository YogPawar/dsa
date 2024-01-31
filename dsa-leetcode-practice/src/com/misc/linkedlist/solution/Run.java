package com.misc.linkedlist.solution;

public class Run {

  public static void main(String[] args) {

    // Create a new LinkedList and append values to it
    LinkedList ll = new LinkedList(3);
    ll.append(3);
    ll.append(5);
    ll.append(33);
    ll.append(33);
    ll.append(5);
    // Print the list before partitioning
    //.out.println("LL before partitionList:");
    // ll.printList(); // Output: 3 5 8 10 2 1

    // Call the partitionList method with x = 5
    // ll.partitionList(5);

    // Print the list after partitioning
    // System.out.println("LL after partitionList:");
    ll.printList();
    System.out.println("After removing");
    ll.removeDuplicateWithoutSet();
    ll.printList(); // Output: 3 2 1 5 8 10

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before partition_list:
            3
            5
            8
            10
            2
            1
            LL after partition_list:
            3
            2
            1
            5
            8
            10

        */

  }
}
