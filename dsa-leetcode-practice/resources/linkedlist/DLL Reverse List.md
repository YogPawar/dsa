## DLL: Reverse ( ** Interview Question)
Implement a method called reverse() that reverses the order of the nodes in the list.

This method should reverse the order of the nodes in the list by manipulating the pointers of each node, not by swapping the values within the nodes.


Method Signature:

public void reverse()


Output:

No explicit output is returned. However, the method should modify the doubly linked list such that the order of the nodes is reversed.


Constraints:

The doubly linked list may be empty or have one or more nodes.


Example:

Consider the following doubly linked list:

Head: 1
Tail: 5
Length: 5

Doubly Linked List:
1 <-> 2 <-> 3 <-> 4 <-> 5


After calling reverse(), the list should be:

Head: 5
Tail: 1
Length: 5

Doubly Linked List:
5 <-> 4 <-> 3 <-> 2 <-> 1


### Pseudo Code:

Initialize variables:

Set currentNode to head.

Set temporaryNode to null.

Iterate through the list:

While currentNode is not null, do the following:

Set temporaryNode to currentNode.prev.

Set currentNode.prev to currentNode.next.

Set currentNode.next to temporaryNode.

Set currentNode to currentNode.prev.

Swap head and tail:

Set temporaryNode to head.

Set head to tail.

Set tail to temporaryNode.

### Solution

    public void reverse() {
        Node current = head;
        Node temp = null;
    
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
    
        temp = head;
        head = tail;
        tail = temp;
    }




The reverse method in the DoublyLinkedList class is designed to reverse the order of the nodes in a doubly linked list. Here's a step-by-step explanation of how the method works:



Initialization:

Node current = head;: It starts by creating a Node reference named current and initializes it to the head of the list. This will be used to traverse the list.

Swapping next and prev for each Node:

The method enters a while loop while (current != null) that continues as long as current is not null, meaning it goes through the list until it reaches the end.

Inside the loop:

temp = current.prev;: It temporarily stores the previous node of current in temp. This is necessary because the next step will overwrite current.prev.

current.prev = current.next;: The previous node reference of current is set to its next node, effectively starting the process of reversing the link.

current.next = temp;: The next node reference of current is set to the stored previous node (from temp), continuing the reversal of the link.

current = current.prev;: The current pointer is moved to the next node in the original list, which, after the swap, is the original previous node (current.prev).

Swapping head and tail:

After the loop, the nodes are reversed, but the head and tail references of the list are still pointing to their original positions.

temp = head;: The original head is stored in temp.

head = tail;: The head reference is updated to the original tail.

tail = temp;: The tail reference is updated to the original head.



The overall effect of this method is that the direction of the doubly linked list is reversed. The head of the list becomes the tail, and vice versa, with all next and prev references of each node in the list also reversed. This method operates in-place, meaning it changes the original list without creating a new one.





Code with inline comments:



    public void reverse() {
        // 'current' starts at the head of the list. This is the starting point
        // for the reversal process.
        Node current = head;
    
        // 'temp' is a temporary variable used for swapping nodes. It is initially
        // set to null since we haven't started the swapping process yet.
        Node temp = null;
     
        // We enter a loop that will continue as long as 'current' is not null.
        // This loop goes through each node in the list.
        while (current != null) {
            // Store the previous node of 'current' in 'temp'.
            // This is needed because we will be overwriting 'current.prev' next,
            // and we don't want to lose this reference.
            temp = current.prev;
     
            // The next two lines are where we swap the 'next' and 'prev' references
            // of the 'current' node. This effectively reverses the direction of the
            // links for 'current'.
            current.prev = current.next; // 'prev' now points to what used to be 'next'
            current.next = temp;         // 'next' now points to what used to be 'prev'
     
            // Move to the next node in the original list. After the swap, the original
            // 'next' node is now in 'current.prev', so we update 'current' to this node.
        current = current.prev;
    }
 
        // After the while loop, the list is reversed, but our 'head' and 'tail' pointers
        // are still pointing to the original head and tail. So we need to swap them.
        temp = head;   // Store the original head in 'temp'
        head = tail;   // Update head to be the original tail
        tail = temp;   // Update tail to be what was originally the head
}


