## LL: Remove Duplicates ( ** Interview Question)
You are given a singly linked list that contains integer values, where some of these values may be duplicated.



Note: this linked list class does NOT have a tail which will make this method easier to implement.



Your task is to implement a method called removeDuplicates() within the LinkedList class that removes all duplicate values from the list.

Your method should not create a new list, but rather modify the existing list in-place, preserving the relative order of the nodes.

You can implement the removeDuplicates() method in two different ways:



Using a Set (HashSet) - This approach will have a time complexity of O(n), where n is the number of nodes in the linked list. You are allowed to use the provided Set data structure in your implementation.

Without using a Set - This approach will have a time complexity of O(n^2), where n is the number of nodes in the linked list. You are not allowed to use any additional data structures for this implementation.



Here is the method signature you need to implement:

public void removeDuplicates() {
// Your implementation goes here
}


Example:

Input:

LinkedList: 1 -> 2 -> 3 -> 1 -> 4 -> 2 -> 5

Output:

LinkedList: 1 -> 2 -> 3 -> 4 -> 5

## Hints

Pseudo Code (for solution that uses a set):

Create an empty HashSet called values to store the unique node values encountered in the linked list.

Initialize two pointers: previous set to null, and current pointing to the head of the list.

Start a while loop that continues until current is null: a. Check if values contains the value of the current node. i. If it does, update the next pointer of the previous node to skip the current node (i.e., previous.next = current.next), and decrement the list length by 1. b. If it does not, add the value of the current node to the values set and update the previous pointer to point to the current node. c. Move current one step ahead (i.e., current = current.next).

When the while loop ends, all duplicate nodes will have been removed from the list.



This algorithm uses a HashSet to keep track of unique values in the linked list and removes duplicates by updating the next pointers of the nodes as needed.





Pseudo Code (for solution that does not use a set):

Initialize a pointer current pointing to the head of the list.

Start an outer while loop that continues until current is null: a. Initialize a pointer runner pointing to the current node. b. Start an inner while loop that continues until runner.next is null: i. Check if the value of the runner.next node is equal to the value of the current node. 1. If it is, update the next pointer of the runner node to skip the duplicate node (i.e., runner.next = runner.next.next), and decrement the list length by 1. ii. If it is not, move the runner pointer one step ahead (i.e., runner = runner.next). c. Move current one step ahead (i.e., current = current.next).

When the outer while loop ends, all duplicate nodes will have been removed from the list.



This algorithm uses two nested loops to traverse the linked list, removing duplicate nodes by updating the next pointers of the nodes as needed, without the use of any additional data structure like a HashSet.


For the optimal solution you will want to use a Set (you can read more about Sets here):

I have also included an implementation that does not use a Set at the bottom of this explanation.

Either solution will work but the one with a Set is O(n) while the other is O(n^2) time complexity.


Solution Using a Set:

    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
                length -= 1;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }




This method aims to remove duplicate nodes from a singly linked list while retaining the unique ones. To accomplish this, it uses a Set data structure to keep a record of unique node values encountered during the traversal.

Line-by-Line Explanation

Set<Integer> values = new HashSet<>();

Creating a HashSet: Here, we create a new HashSet called values.

Storing Unique Integers: This set will hold the unique integer values encountered in the linked list.

Why a HashSet: A HashSet automatically manages duplicates, which makes it an ideal choice. When you try to add a duplicate value to a HashSet, the set will ignore it.

Node previous = null;

Declare and Initialize: We declare a Node variable called previous and initialize it to null.

Role of Previous: The previous node is a reference to the node that immediately precedes the current node in the list.

Why Initialize to Null: Initially, there is no preceding node, so previous is set to null.

Node current = head;

Declare and Initialize: A Node variable called current is declared and set to the head of the linked list.

Role of Current: This current node serves as our pointer for traversing the linked list, starting from the head.

while (current != null) { ... }

Loop Until the End: This loop iterates through the linked list until it reaches the end.

End Condition: The loop will terminate when current is null, indicating the end of the list.

if (values.contains(current.value)) { ... } else { ... }

Checking for Duplicates: The code checks if the set values already contains the value of the current node.

Duplicate Detection: If it does, that means the node is a duplicate and needs to be removed.

previous.next = current.next;

Removing the Node: If current is a duplicate, previous.next is updated to point to current.next.

Effect: This action skips the current node, effectively removing it from the list.

length -= 1;

Decrement Length: The length of the list is decremented by 1 because a node has been removed.

Keeping Count: This is necessary for maintaining an accurate count of the nodes in the linked list.

values.add(current.value);

Adding to Set: If current is not a duplicate, its value is added to the values set.

Why Add: This is to ensure that any future nodes with the same value will be recognized as duplicates.

previous = current;

Update Previous: The previous node is updated to point to the current node.

Moving Forward: This sets the stage for the next iteration where current will move ahead.

current = current.next;

Move to Next Node: Finally, current is updated to point to the next node in the list, preparing it for the next cycle of the loop.



Summary

After completing all the iterations, the method will have removed all duplicate nodes from the linked list. It does this while updating the length of the list and keeping track of unique node values using a HashSet.





Code with inline comments:



    public void removeDuplicates() {
    // Step 1: Create a Set to store unique node values.
    // We initialize a HashSet, which allows for fast look-up
    // to check for duplicates later on.
    Set<Integer> values = new HashSet<>();

    // Step 2: Initialize a Node variable 'previous' to null.
    // 'previous' will help us unlink a node if it's a duplicate.
    Node previous = null;
    
    // Step 3: Initialize 'current' to point to the head node.
    // 'current' will be used to iterate through the linked list.
    Node current = head;
    
    // Step 4: Begin iteration through the linked list.
    // We will keep iterating until 'current' becomes null,
    // indicating we have reached the end of the list.
    while (current != null) {
        
        // Step 5: Check for duplicates.
        // We check if the current node's value is already in the set.
        if (values.contains(current.value)) {
            
            // Step 6: Remove the duplicate node.
            // By setting 'previous.next' to 'current.next',
            // we remove the link to 'current', effectively
            // deleting it from the list.
            previous.next = current.next;
            
            // Step 7: Update the length of the list.
            // Since we removed a node, we decrement the length by 1.
            length -= 1;
            
        } else {
            
            // Step 8: Add unique value to set.
            // If the current value is not a duplicate,
            // we add it to the set for future reference.
            values.add(current.value);
            
            // Step 9: Update 'previous' node.
            // We set 'previous' to the 'current' node, as we
            // move forward in the list.
            previous = current;
        }
        
        // Step 10: Move to the next node.
        // We update 'current' to point to the next node in the list,
        // continuing our iteration.
        current = current.next;
    }
}



Alternative Solution (does not use a Set):

You can also do this without a Set but this will change the Big O from O(n) to O(n^2):

A Set is a data structure that we will learn more about later in the course.

Here is the solution without using a Set:



    public void removeDuplicates() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length -= 1;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }




Overall Explanation:

This code defines a method called removeDuplicates() in the LinkedList class for a singly linked list in Java. The method is designed to remove duplicate values in the list without using any additional data structures like a Set. It uses two pointers: current and runner to achieve this.



Line-by-Line Explanation:

Node current = head;:

Declare a Node variable: We declare a variable called current of type Node.

Initialize to head: We initialize current to point to the head of the linked list (head).

Purpose: current will serve as our initial point for traversing through the linked list.

while (current != null) { ... }:

While loop: This loop iterates as long as current is not null.

Reach the end: The loop will stop when it reaches the end of the list, represented by current being null.

Purpose: To check every node in the list for duplicates.

Node runner = current;:

Declare another Node variable: Inside the outer loop, we declare another variable runner of type Node.

Initialize to current: runner is set to the node that current is pointing to.

Purpose: runner will traverse the list from current, looking for duplicate values.

while (runner.next != null) { ... }:

Inner While loop: This loop iterates as long as runner.next is not null.

Remaining nodes: It starts from the node after current and goes until the end of the list.

Purpose: To compare the current node's value against all subsequent nodes' values for duplicates.

if (runner.next.value == current.value) { ... } else { ... }:

Conditional Check: Inside the inner loop, we compare the value of the node that runner.next is pointing to with the value of the node that current is pointing to.

Purpose: To identify if a duplicate node exists.

runner.next = runner.next.next;:

Update next pointer: If we find a duplicate, the next pointer of the runner node is updated to point to the node after runner.next.

Effect: This essentially removes runner.next from the list, thus removing the duplicate.

length -= 1;:

Decrement Length: After removing a duplicate node, we reduce the length variable by 1.

Purpose: To keep an accurate count of the number of nodes in the list.

runner = runner.next;:

Move runner: If the nodes are not duplicates, we move runner to the next node.

Purpose: To continue checking the next set of nodes for duplicates.

current = current.next;:

Move current: After the inner loop has finished, current is moved to the next node.

Purpose: To proceed with checking the next unique node in the list for duplicates.



Final Outcome:

After both the outer and inner loops have completed their iterations, any nodes in the list with duplicate values will have been removed, while preserving the relative order of the remaining nodes.





Code with inline comments:



    public void removeDuplicates() {
    // Step 1: Start at the beginning of the list.
    // Initialize `current` to point to the head node.
    // `current` will be used to navigate through the list,
    // one node at a time, starting from the head node.
    Node current = head;

    // Step 2: Check if we've reached the end of the list.
    // We loop until `current` becomes null, which means
    // we've checked all nodes for duplicates.
    while (current != null) {
 
        // Step 3: Set up a runner node.
        // Initialize `runner` to the `current` node.
        // We'll use `runner` to scan ahead and find duplicates
        // of the `current` node.
        Node runner = current;
 
        // Step 4: Loop through the remaining nodes.
        // `runner.next` will be null at the end of the list.
        while (runner.next != null) {
 
            // Step 5: Compare nodes.
            // Check if `runner.next` (the next node) has the
            // same value as `current`.
            if (runner.next.value == current.value) {
 
                // Step 6: Remove duplicate.
                // If we find a duplicate, we skip it by
                // setting `runner.next` to `runner.next.next`.
                runner.next = runner.next.next;
 
                // Step 7: Update list length.
                // We removed a node, so decrease the list length
                // by 1 to keep it accurate.
                length -= 1;
 
            } else {
 
                // Step 8: Move to the next node.
                // If the next node is not a duplicate,
                // move `runner` to the next node to continue.
                runner = runner.next;
            }
        }
 
        // Step 9: Move to the next unique node.
        // After checking all nodes for duplicates of the
        // current value, move `current` to the next node.
        current = current.next;
    }
}


