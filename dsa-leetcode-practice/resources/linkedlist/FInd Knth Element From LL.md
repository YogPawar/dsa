## LL: Find Kth Node From End ( ** Interview Question)
Implement a method called findKthFromEnd that returns the k-th node from the end of the list.

If the list has fewer than k nodes, the method should return null.

Note: This implementation of the Linked List class does not have the length attribute.

Method signature:

public Node findKthFromEnd(int k)


Example:

LinkedList myList = new LinkedList(1);
myList.append(2);
myList.append(3);
myList.append(4);
myList.append(5);

Node result = myList.findKthFromEnd(2); // Output: Node with value 4

result = myList.findKthFromEnd(5); // Output: Node with value 1

result = myList.findKthFromEnd(6); // Output: null


Note:

In this problem, you should use the two-pointer technique to efficiently find the k-th node from the end of the linked list.

## Solution Explanation 

This code defines a method called findKthFromEnd inside a LinkedList class, which takes an integer k as input and returns the kth node from the end of the LinkedList.



The method initializes two pointers, slow and fast, both pointing to the head of the LinkedList.

It then moves the fast pointer k steps ahead in the LinkedList. If fast becomes null at any point during this process, it means that k is out of bounds (greater than the length of the LinkedList), so the method returns null.

After moving the fast pointer k steps ahead, the method enters a while loop. This loop continues until the fast pointer reaches the end of the LinkedList (i.e., fast becomes null).

Inside the while loop, both the slow and fast pointers move one step at a time. Since the fast pointer is already k steps ahead of the slow pointer, when the fast pointer reaches the end of the LinkedList, the slow pointer will be at the kth node from the end.

Finally, the method returns the slow pointer, which now points to the kth node from the end of the LinkedList.