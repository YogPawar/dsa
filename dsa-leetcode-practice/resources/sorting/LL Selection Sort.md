### Selection Sort of LL ( ** Interview Question)
Implement the Selection Sort algorithm on a singly linked list.

The linked list will contain integer elements.

You are required to write a method selectionSort() within the LinkedList class. This method will sort the linked list in ascending order using the Selection Sort algorithm.

The Selection Sort algorithm works by dividing the list into a sorted and an unsorted region. The sorted region starts out empty and the unsorted region is initially the entire list. The algorithm repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted region and moves it into the sorted region. When the unsorted region becomes empty, the algorithm stops and the list is sorted.

Here is a brief overview of the steps involved in implementing the selection sort algorithm:

Check if the length of the linked list is less than 2. If it is, the list is already sorted, so the method should return immediately.

Initialize a Node object current to the head of the list.

Set up a while loop that continues as long as current.next is not null.

Within this loop, set smallest to current and innerCurrent to the next node in the list.

While innerCurrent is not null, if innerCurrent's value is less than smallest's value, set smallest to innerCurrent. Then, advance innerCurrent to the next node.

After going through all nodes in the unsorted region, if smallest is not current, swap the values in smallest and current.

Move current to the next node and repeat the process until the entire list is sorted.

At the end of the sort, update the tail of the list to current.



Please ensure your code follows these steps to correctly implement the selection sort method.

Assume that all values in the list are integers. The selectionSort() method should not return any value; it should sort the linked list in-place. That is, it should modify the original linked list rather than creating and returning a new, sorted list.

### Hint
Pseudo Code:

Check if the length of the LinkedList is less than 2.

1.1 If true, return from the function immediately as there's nothing to sort.

Set current Node to the head of the LinkedList. This will be the start of the unsorted part of the list.

Start the outer while loop

3.1 The condition for this loop is that the next node of current is not null.

Inside the outer loop:

4.1 Set smallest Node to current. This will keep track of the node with the smallest value in the unsorted part of the list.

4.2 Set innerCurrent Node to the node next to current.

Start the inner while loop.

5.1 The condition for this loop is that innerCurrent is not null.

Inside the inner loop:

6.1 Check if the value of innerCurrent is less than the value of smallest.

6.1.1 If true, set smallest to innerCurrent.

6.2 Move innerCurrent to the next node in the LinkedList.

After the inner loop, check if smallest is not equal to current.

7.1 If true, swap the values of current and smallest.

Move current to the next node in the LinkedList.

Repeat the outer loop until the entire LinkedList is sorted.

After the outer loop, set the tail of the LinkedList to current.

### Solution
    void selectionSort() {
        if (this.length < 2)
            return;
        Node current = this.head;
        while (current.next != null) {
            Node smallest = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (innerCurrent.value < smallest.value) {
                    smallest = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }
            if (smallest != current) {
                int temp = current.value;
                current.value = smallest.value;
                smallest.value = temp;
            }
            current = current.next;
        }
        this.tail = current;
    } 




This code represents a method for sorting a linked list using the Selection Sort algorithm.

Here's a detailed step-by-step explanation:

The if (this.length < 2) return; statement checks if the linked list's length is less than 2. If it's true, there is no need for sorting as a list of length 0 or 1 is already sorted.

Node current = this.head; sets a node current to the head of the linked list. The current node is used to traverse the list and represent the first element of the unsorted part of the list.

The while (current.next != null) { ... } loop iterates over the linked list starting from the head until the second-to-last element.

Within this loop, Node smallest = current; is initializing smallest to be the current node. This smallest node will keep track of the smallest element found in the unsorted part of the list.

Node innerCurrent = current.next; is setting innerCurrent to the node after current. innerCurrent is used to traverse the unsorted part of the list to find the smallest element.

The inner while (innerCurrent != null) { ... } loop iterates through the unsorted part of the list starting from the node after current until the end of the list.

Inside this loop, the if (innerCurrent.value < smallest.value) statement checks if the value of the innerCurrent node is less than the value of the smallest node. If it's true, smallest is updated to be innerCurrent.

innerCurrent = innerCurrent.next; moves innerCurrent to the next node in the list.

After the inner loop, if (smallest != current) checks if the smallest node found in the unsorted part of the list is different from current. If it's true, it means that a smaller value than current.value was found in the unsorted part of the list.

If smallest is not equal to current, the values of current and smallest are swapped using a temporary variable temp.

current = current.next; moves current to the next node in the list, effectively reducing the unsorted part of the list by one.

After the outer loop, this.tail = current; sets the tail of the linked list to be current. This is necessary because current is the last node processed by the algorithm and hence is the last node in the sorted list.



This sorting method works by dividing the list into a sorted and an unsorted part. The sorted part is at the beginning of the list and is initially empty. The unsorted part is the rest of the list. The algorithm repeatedly selects the smallest element from the unsorted part and moves it to the end of the sorted part. The process continues until the unsorted part becomes empty and the list is fully sorted.





Code with inline comments:



    void selectionSort() {
        if (this.length < 2)
        return;
         // If list length is less than 2, no need to sort
    
        // Initialize current node as head
        Node current = this.head;
     
        // Iterate over the list until the second last element
        while (current.next != null) {
            
            // Assume current node is the smallest
            Node smallest = current;
     
            // Start checking from the next node
            Node innerCurrent = current.next;
     
            // Inner loop to find smallest node in unsorted part
            while (innerCurrent != null) {
                // If a smaller node is found, update smallest
                if (innerCurrent.value < smallest.value) {
                    smallest = innerCurrent;
                }
                // Move to the next node
                innerCurrent = innerCurrent.next;
            }
            
            // Swap current node and smallest node if they're not the same
            if (smallest != current) {
                int temp = current.value;
                current.value = smallest.value;
                smallest.value = temp;
            }
            
            // Move to next node in the list
            current = current.next;
        }
        
        // After sorting, current is the last node. Update tail
        this.tail = current;
} 