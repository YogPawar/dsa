### DLL: Swap First and Last ( ** Interview Question)
Swap First and Last Node Values in a Doubly Linked List.

Given a doubly linked list, write a method called swapFirstLast() that swaps the values of the first and last nodes in the list.

If the length of the list is less than 2, the method should not perform any operation.


Function Signature:

public void swapFirstLast()


Input:

The method is part of the DoublyLinkedList class, which has a head and a tail pointer, as well as a length attribute.



Output:

No explicit output is returned. However, the method should modify the doubly linked list such that the values of the first and last nodes are swapped.



Constraints:

The doubly linked list may be empty, have only one node, or have two or more nodes.



Example:

Consider the following doubly linked list:

Head: 1
Tail: 5
Length: 5

Doubly Linked List:
1 <-> 2 <-> 3 <-> 4 <-> 5


After calling swapFirstLast(), the list should be:

Head: 5
Tail: 1
Length: 5

Doubly Linked List:
5 <-> 2 <-> 3 <-> 4 <-> 1


Note that the pointers to the nodes themselves are not swapped - only their values are exchanged.

### Hint

Pseudo Code:

Check if the length of the doubly linked list is less than 2. If it is, return, as there are no nodes to swap.

If the length is 2 or more, proceed with swapping the values of the first and last nodes:

Store the value of the head node in a temporary variable, temp.

Set the value of the head node to the value of the tail node.

Set the value of the tail node to the value stored in temp.



This algorithm simply swaps the values of the first and last nodes of the doubly linked list. It does not involve updating any pointers or modifying the structure of the list.


### Solution 

    public void swapFirstLast() {
        if (length < 2) return;
        int temp = head.value;
        head.value = tail.value;
        tail.value = temp;
    }




The method swaps the values of the first and last nodes in the list.

The method checks if the length of the list is less than 2, meaning that the list has either zero or one element, in which case there is no need to swap anything, and the method just returns.

Otherwise, the method creates a temporary variable temp to store the value of the head node, which is the first node in the list.  Then, it assigns the value of the tail node, which is the last node in the list, to the value of the head node.  Finally, it assigns the value of the temporary variable temp to the value of the tail node.

By doing so, the values of the first and last nodes in the list are swapped.





Code with inline comments:



    public void swapFirstLast() {
    // If there are less than two nodes in the list, there's nothing to swap
    if (length < 2) return;

    // Swap the values of the head and tail nodes
    int temp = head.value;
    head.value = tail.value;
    tail.value = temp;
}
