### Bubble Sort of LL ( ** Interview Question)

Implement the bubble sort algorithm in a singly linked list.

The linked list will contain integer elements.

You need to write a method bubbleSort() within the LinkedList class. This method will sort the
linked list in ascending order using the Bubble Sort algorithm.

The Bubble Sort algorithm works by comparing each pair of adjacent elements in the list and swapping
them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

Here is a brief overview of the steps involved in implementing the bubble sort algorithm:

Check if the length of the linked list is less than 2. If it is, the list is already sorted, so the
method should return immediately.

Initialize a Node object sortedUntil to null. This will act as a marker to the end of the sorted
portion of the list.

Set up a while loop that continues as long as sortedUntil does not equal the second node in the
list (this.head.next).

Within this loop, start from the head of the list and compare the value of the current node with the
value of the next node.

If the value of the current node is greater than the value of the next node, swap the values.

Continue comparing and swapping until you reach the node before sortedUntil.

At the end of each pass through the list, set sortedUntil to the last node that was examined. This
marks the end of the sorted portion of the list and the start of the unsorted portion for the next
pass.

The algorithm continues until the list is fully sorted.

Please make sure your code follows the above steps to implement the bubble sort method correctly.

You may assume that all values in the list are integers. Also, please note that your bubbleSort()
method should not return any value; it should sort the linked list in-place. That is, it should
modify the original linked list rather than creating and returning a new, sorted list.

### Hint

Pseudo Code:

Check if the length of the LinkedList is less than 2

1.1 If true, return from the function immediately as there's nothing to sort.

Initialize sortedUntil Node as null. This variable keeps track of the position until which the list
has been sorted.

Start the outer while loop

3.1 The condition for this loop is that sortedUntil is not equal to the second node in the list.

Inside the outer loop:

4.1 Set current Node to the head of the LinkedList. This variable keeps track of the current node
being processed.

Start the inner while loop

5.1 The condition for this loop is that the next Node of current is not equal to sortedUntil.

Inside the inner loop:

6.1 Set nextNode to the node next to current.

6.2 Check if the value of current is greater than the value of nextNode.

6.2.1 If true, swap the values of current and nextNode.

6.3 Move current to the next node in the LinkedList.

After the inner loop, set sortedUntil to current. This means the list is sorted until current and
sortedUntil will be the starting point of the unsorted portion in the next pass.

Repeat the outer loop until the entire LinkedList is sorted.

### Solution

    void bubbleSort() {
    if (this.length < 2)
    return;

        Node sortedUntil = null;
        while (sortedUntil != this.head.next) {
            Node current = this.head;
            while (current.next != sortedUntil) {
                Node nextNode = current.next;
                if (current.value > nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                }
                current = current.next;
            }
            sortedUntil = current;
        }
    }

This code is implementing a Bubble Sort algorithm to sort a linked list.

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent
elements and swaps them if they are in the wrong order.

Here's the detailed explanation of the code:

if (this.length < 2) return;: This statement is checking if the linked list has less than 2 nodes.
If true, there is no need for sorting because a list of length 0 or 1 is already sorted.

Node sortedUntil = null;: This line creates a node sortedUntil and sets it to null. This node
represents a marker up to which the list is known to be sorted.

while (sortedUntil != this.head.next) { ... }: This outer while loop runs until sortedUntil is not
equal to the second node in the list. This loop ensures that the sorting process continues until the
entire list is sorted.

Inside this loop, Node current = this.head; initializes current to be the first node of the list.
This node is used to traverse the list and represents the current node being inspected.

The inner loop while (current.next != sortedUntil) { ... } iterates over the list starting from the
head up to the node before sortedUntil. This is the part of the list that we're bubbling elements
through in the current iteration.

Inside this inner loop, Node nextNode = current.next; sets nextNode to be the node after current.

The if (current.value > nextNode.value) condition checks if the value of the current node is greater
than the value of the nextNode. If true, the nodes are in the wrong order and need to be swapped.

If the nodes need to be swapped, int temp = current.value; current.value = nextNode.value;
nextNode.value = temp; swaps the values of current and nextNode using a temporary variable temp.

current = current.next; advances current to the next node in the list.

After the inner loop, sortedUntil = current; updates sortedUntil to be current. This indicates that
all elements up to and including current are now sorted.

The Bubble Sort algorithm works by repeatedly swapping adjacent elements if they are in the wrong
order. The process continues until no more swaps are needed, which indicates that the list is
sorted. This method in particular starts the sorting from the beginning of the list each time,
bubbling the largest unsorted element to its correct place, until the entire list is sorted.

Code with inline comments:

    void bubbleSort() {
    // If list length is less than 2, no need to sort
    if (this.length < 2)
    return;

    // Initialize sortedUntil as null (nothing is sorted initially)
    Node sortedUntil = null;
 
    // Outer loop continues until sorted part reaches the second node
    while (sortedUntil != this.head.next) {
 
        // Start with the head node
        Node current = this.head;
 
        // Inner loop for each pass
        while (current.next != sortedUntil) {
 
            // Compare current node with next node
            Node nextNode = current.next;
            
            // If current node is greater, swap values
            if (current.value > nextNode.value) {
                int temp = current.value;
                current.value = nextNode.value;
                nextNode.value = temp;
            }
 
            // Move to the next node
            current = current.next;
        }
        
        // After each pass, the largest element is bubbled to the end
        // Thus, update sortedUntil to point to the last sorted element
        sortedUntil = current;
    }

}
