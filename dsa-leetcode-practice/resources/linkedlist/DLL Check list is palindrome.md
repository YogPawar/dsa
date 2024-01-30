## DLL: Palindrome Checker ( ** Interview Question)

Write a method to determine whether a given doubly linked list reads the same forwards and
backwards.

For example, if the list contains the values [1, 2, 3, 2, 1], then the method should return true,
since the list is a palindrome.

If the list contains the values [1, 2, 3, 4, 5], then the method should return false, since the list
is not a palindrome.

Method name: isPalindrome

Return Type: boolean

### Hint

Pseudo Code:

Check list length:

If the length of the doubly linked list is less than or equal to 1, return true, as it is a
palindrome.

Initialize nodes for traversal:

Set forwardNode to head.

Set backwardNode to tail.

Traverse and compare values:

For i in the range 0 to (length / 2), do the following:

If forwardNode.value is not equal to backwardNode.value, return false, as it is not a palindrome.

Set forwardNode to forwardNode.next.

Set backwardNode to backwardNode.prev.

Return true, as the list is a palindrome.

### Solution

    public boolean isPalindrome() {
        if (length <= 1) return true;
        
        Node forwardNode = head;
        Node backwardNode = tail;
        for (int i = 0; i < length / 2; i++) {
            if (forwardNode.value != backwardNode.value) return false;
            forwardNode = forwardNode.next;
            backwardNode = backwardNode.prev;
        }
        return true;
    }

The isPalindrome method in a doubly linked list checks whether the list is a palindrome, meaning
that it reads the same forwards and backwards.

Here's how the method works:

If the length of the list is less than or equal to 1, then the list is a palindrome by definition,
so the method returns True.

The method initializes two pointers, forwardNode and backwardNode, that point to the head and tail
of the list, respectively. The method then iterates over half of the list, comparing the values of
the nodes at each end of the list to see if they are the same.

If the values of the nodes do not match, the method returns false, indicating that the list is not a
palindrome. If all of the values match, the method returns true, indicating that the list is a
palindrome.

This implementation of the method takes advantage of the fact that a doubly linked list allows for
efficient traversal from both ends of the list, which makes it possible to check if the list is a
palindrome in O(n) time, where n is the length of the list.

Code with inline comments:

    public boolean isPalindrome() {
        // if the list has only 1 or 0 nodes, it's automatically a palindrome
        if (length <= 1) return true;
    
        // set up two pointers starting from opposite ends of the list
        Node forwardNode = head;
        Node backwardNode = tail;
        
        // iterate through the list until the two pointers meet in the middle
        for (int i = 0; i < length / 2; i++) {
            // if the values at the two pointers don't match, the list is not a palindrome
            if (forwardNode.value != backwardNode.value) return false;
            
            // move the pointers toward the center of the list
            forwardNode = forwardNode.next;
            backwardNode = backwardNode.prev;
        }
        

        // if the loop completes without returning false, the list is a palindrome
    return true;

}
