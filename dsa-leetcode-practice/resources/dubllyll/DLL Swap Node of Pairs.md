DLL: Swap Nodes in Pairs ( ** Interview Question)

ATTENTION: Advanced Doubly Linked List Challenge Ahead!

This question is acknowledged as one of the more intricate challenges within the Doubly Linked List
section. It's not unusual for students to find this task quite formidable at this point in the
course.

If you're considering diving into this problem, it's crucial to approach it methodically. I
recommend drawing out the list structures and operations to better visualize the problem. This
challenge demands a deep understanding of Doubly Linked Lists' unique characteristics and
manipulation techniques.

Use this opportunity to deepen your understanding, but also remember it's absolutely fine to come
back to this problem later if it feels overwhelming now. Progress in complex concepts like these
sometimes requires stepping back and revisiting with fresh insights. Good luck, and remember that
perseverance is key in mastering these advanced topics!

Now, here is the problem:

_________________________________



You are given a doubly linked list.

Implement a method called swapPairs within the class that swaps the values of adjacent nodes in the
linked list. The method should not take any input parameters.

Note: This DoublyLinkedList does not have a tail pointer which will make the implementation easier.

Example:

1 <-> 2 <-> 3 <-> 4

should become

2 <-> 1 <-> 4 <-> 3

Your implementation should handle edge cases such as an empty linked list or a linked list with only
one node.

Note: You must solve the problem WITHOUT MODIFYING THE VALUES in the list's nodes (i.e., only the
nodes' prev and next pointers may be changed.)

### Hint

Pseudo Code:

As you work through the pseudo-code, I recommend sketching the nodes, pointers, and each step on
paper. This visual representation will greatly aid in understanding and tracking the process.

Initialize variables:

Create a dummyNode with value 0.

Set dummyNode.next to head.

Set previousNode to dummyNode.

Iterate through the list:

While head is not null and head.next is not null, execute the following sub-steps.

Identify nodes to swap:

Set firstNode to head.

Set secondNode to head.next.

Update pointers to swap nodes:

Set previousNode.next to secondNode.

Set firstNode.next to secondNode.next.

Set secondNode.next to firstNode.

Update previous pointers:

Set secondNode.prev to previousNode.

Set firstNode.prev to secondNode.

If firstNode.next is not null, set firstNode.next.prev to firstNode.

Move pointers for the next iteration and update list head:

Set head to firstNode.next.

Set previousNode to firstNode.

Eventually, set head to dummyNode.next.

### Solution

    public void swapPairs() {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;
    
        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;
    
            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
    
            secondNode.prev = previousNode;
            firstNode.prev = secondNode;
            
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }
    
            head = firstNode.next;
            previousNode = firstNode;
        }
    
        head = dummyNode.next;
        if (head != null) head.prev = null;
    }

Imagine a doubly linked list: 1 <-> 2 <-> 3 <-> 4

After the swap, the list should look like: 2 <-> 1 <-> 4 <-> 3

Initialization:

    Node dummyNode = new Node(0);

A dummy node is created to simplify the swapping process. This is a common trick used when modifying
linked lists, as it helps in handling edge cases.

    dummydummyNode.next = head;

Connect the dummy node to the head of the linked list.

    Node previousNode = dummy;

previousNode will always point to the node before the pair of nodes we're currently working on.
Initially, it points to dummyNode.

Loop to swap adjacent pairs:

    while (head != null && head.next != null) { ... }

This loop will run as long as there are at least two nodes left to swap.

Inside the loop:

    Node firstNode = head;

    Node secondNode = head.next;

Identify the two nodes which we will be swapping.

    previousNode.next = secondNode;

Adjust the previous node's next pointer to point to secondNode.

    firstNode.next = secondNode.next;

Point the next of the firstNode to the node right after secondNode.

    secondNode.next = firstNode;

Now, make the secondNode point to firstNode, thereby completing the main part of the swap.

For the doubly linked list, we also need to adjust the prev pointers:

    secondNode.prev = previousNode;

    firstNode.prev = secondNode;

Adjust the prev pointers to reflect the swapped positions.

    if (firstNode.next != null) {

    firstNode.next.prev = firstNode;

    }

If there's a node after firstNode, adjust its prev pointer to point back to firstNode.

    head = firstNode.next;

Move the head to the node after firstNode for the next iteration.

    previousNode = firstNode;

Update the previousNode to firstNode for the next iteration.

Finalizing:

    head = dummyNode.next;

Reset the head of our list to exclude the dummy node.

    if (head != null) head.prev = null;

If there's a node present, make sure its prev is null, indicating the start of the list.

Summary:

The function swaps adjacent pairs of nodes in a doubly linked list. It uses a dummy node at the
beginning of the list to facilitate swapping. After adjusting all the next and prev pointers for
each pair, it re-positions the head and prev node pointers for the next iteration. After completing
all swaps, it resets the list's head to exclude the dummy node.

Let's walk through an example step by step:

Initial list:
1 <-> 2 <-> 3 <-> 4

Goal:
2 <-> 1 <-> 4 <-> 3

1. Setting Up the Starting Point (Dummy Node):

Node dummyNode = new Node(0);
dummyNode.next = head;
Node previousNode = dummyNode;
After these lines, our list is conceptually:
(dummy) <-> 1 <-> 2 <-> 3 <-> 4

2. Checking if There are Nodes to Swap:

while (head != null && head.next != null) {
Our current head is 1. Since 1 and its next node 2 exist, we enter the loop to swap them.

3. Swapping the First Pair (1 and 2):

Pick up the two nodes:

    Node firstNode = head;       // 1
    Node secondNode = head.next; // 2

Move the second node to the position of the first:

    previousNode.next = secondNode;      // dummy now points to 2
    (dummy) -> 2

1 still points to 2, and we'll fix that soon.

Make the first node point to the node after the second:

    firstNode.next = secondNode.next; // 1 now points to 3
    (dummy) -> 2 <-> 1 -> 3

Place the first node (1) next to the second one (2):

    secondNode.next = firstNode;     // 2 now points to 1
    (dummy) -> 2 <-> 1 -> 3 <-> 4

Adjusting previous pointers:

    secondNode.prev = previousNode;  // 2's prev is set to dummy
    firstNode.prev = secondNode;     // 1's prev is set to 2
    if (firstNode.next != null) {
    firstNode.next.prev = firstNode;  // 3's prev is set to 1
    }

4. Move to the Next Pair:

   head = firstNode.next; // Move our current head to 3
   previousNode = firstNode; // Set 1 as the previous node
   Now, our focus is on 3 and 4.


5. Swapping the Second Pair (3 and 4):

Pick up the two nodes:
Same code as before, and now firstNode becomes 3 and secondNode becomes 4.

Move the second node to the position of the first:
A now points to 4.

Make the first node (3) point to the node after the second (if any):
Since there's no node after 4, 3's next will be null.

Place the first node (3) next to the second one (4):
4 points back to 3.

Adjusting prev pointers:
4's prev is set to 1 and 3's prev is set to 4.

6. Tidying Up (after exiting the while loop):

head = dummyNode.next; // Set the list's head to 2
if (head != null) head.prev = null; // Ensure 2's prev is null

Now, our list looks like this:
2 <-> 1 <-> 4 <-> 3

Code with inline comments:

    public void swapNodePairs() {
            // Create a placeholder (dummyNode) node to simplify swapping.
        Node dummyNode = new Node(0);
    
        // Link the dummyNode node to the start of our list.
        dummyNode.next = head;
        
        // Initialize 'previousNode' to 'dummyNode' to remember the node
        // before each pair we're swapping.
        Node previousNode = dummyNode;
     
        // Continue as long as there's a pair of nodes to swap.
        while (head != null && head.next != null) {
     
            // Identify the first node of the pair to swap.
            Node firstNode = head;
     
            // Identify the second node of the pair to swap.
            Node secondNode = head.next;
     
            // Connect the previousNode's 'next' pointer to secondNode,
            // essentially skipping over firstNode.
            previousNode.next = secondNode;
     
            // Connect firstNode to the node after secondNode.
            // This ensures we don't lose the rest of the list.
            firstNode.next = secondNode.next;
     
            // Connect secondNode back to firstNode,
            // completing the swap.
            secondNode.next = firstNode;
     
            // Adjust 'prev' pointers for our doubly linked list.
            // Set secondNode's 'prev' to the node before current pair.
            secondNode.prev = previousNode;
     
            // Set firstNode's 'prev' to secondNode as they've been swapped.
            firstNode.prev = secondNode;
     
            // If there's a node after our current pair, set its 'prev' to firstNode.
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }
     
            // Move the head pointer to the node after the current pair.
            head = firstNode.next;
     
            // Update 'previousNode' for the next pair of nodes.
            previousNode = firstNode;
        }
     
        // After swapping all pairs, update our list's head to
        // start at the node after dummyNode.
        head = dummyNode.next;
     
        // Ensure the new head's 'prev' is null, indicating the start of list.
        if (head != null) head.prev = null;
    }


