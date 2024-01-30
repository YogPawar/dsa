### BST: Kth Smallest Node ( ** Interview Question)

The kthSmallest(int k) method should find the kth smallest element in the binary search tree. If
such an element exists, the method should return its value. If not, it should return null. The
smallest element in the tree is the one with the lowest value, the second smallest element is the
one with the second lowest value, and so on.

The method should use the in-order traversal technique to visit the nodes of the tree, i.e., it
should first visit the left child, then the parent, and finally the right child. To implement this,
use a Stack<Node> to store the nodes. Continue with the traversal as long as there are nodes in the
stack or the current node is not null.

While the current node is not null, push it onto the stack and move to its left child. Then, once
the current node is null, pop a node from the stack, decrement k by one, and if k is zero, return
the value of the popped node. Finally, move to the right child of the popped node.

Examples

For example, if the binary search tree contains the elements [5, 3, 7, 2, 4, 6, 8] and k is 1, the
method should return 2 as this is the smallest element. If k is 3, it should return 4, the third
smallest element. If k is 6, it should return 7, the sixth smallest element. If k is greater than
the number of elements in the tree, the method should return null.

Constraints

You can assume the following constraints:

The value of k will be a positive integer, not exceeding the number of elements in the tree.

The insert(int value) method will be called at least once before kthSmallest(int k).

### Hint

Pseudo Code:

Method kthSmallest:

Input: An integer k

Output: The kth smallest value in the binary search tree, or null if k exceeds the number of
elements in the tree.

Procedure:

2.1: Initialize an empty stack, stack, to store nodes during in-order traversal of the binary search
tree.

2.2: Set node as the root of the binary search tree.

2.3: While loop:

Condition: stack is not empty or node is not null.

Purpose: This loop continues in-order traversal as long as there are nodes left to process.

2.3.1: Nested while loop:

Condition: node is not null.

Purpose: This loop visits the leftmost node of the current subtree.

2.3.1.1: Push node into stack.

2.3.1.2: Move node to its left child.

2.3.2: Pop a node from stack and assign it to node.

2.3.3: Decrease k by 1.

2.3.4: If statement:

Condition: k equals 0.

Purpose: If k equals 0, we have reached the kth smallest node.

2.3.4.1: Return the value of node.

2.3.5: Move node to its right child.

2.4: Return null.

Purpose: This step is reached only when k exceeds the number of elements in the tree.

### Solution

    public Integer kthSmallest(int k) {
        Stack<Node> stack = new Stack<>();
        Node node = this.root;
 
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            k -= 1;
            if (k == 0) {
                return node.value;
            }
            node = node.right;
        }
        return null;
    }

This method is designed to find the kth smallest element in a Binary Search Tree (BST).

Here's a step-by-step breakdown:

Method Signature:

public Integer kthSmallest(int k) This method is public, which means it can be called from any other
class. It takes an integer k as an argument and returns an Integer object. If the kth smallest
element exists, it will return its value; otherwise, it will return null.

Initialization:

Stack<Node> stack = new Stack<>(); An empty stack is created. This stack will be used to keep track
of the nodes as we traverse through the BST.

Node node = this.root; A variable node is initialized to the root of the BST. This variable
represents the current node that we are looking at during the traversal.

First while loop:

while (!stack.isEmpty() || node != null) This loop continues as long as there are unprocessed nodes
in the stack or the current node is not null. This condition ensures that all nodes in the tree are
processed.

Second while loop:

while (node != null) This loop traverses to the leftmost node of the current subtree. It pushes all
the nodes it visits onto the stack along the way.

After the Second while loop:

node = stack.pop(); When there are no more left children to visit, we start processing the nodes in
the stack. We remove the top node from the stack and update the current node node to it.

k -= 1; We decrement k by one. This represents that we've processed one node.

if (k == 0) { return node.value; } If k reaches 0, it means we've found the kth smallest node. Thus,
we return its value.

Move to the right:

node = node.right; After processing a node, we move to its right child. If it has one, the next
inner while loop will traverse to its leftmost node. If it doesn't, the next node in the stack will
be processed.

Return null:

return null; If we've processed all nodes in the tree and k is still greater than 0, it means there
are fewer than k nodes in the tree. In this case, we return null.

This method uses the in-order traversal of BST (left node, root node, right node), which visits
nodes in ascending order. By keeping a count k, it stops when the kth smallest node is visited.

Code with inline comments:

    public Integer kthSmallest(int k) {
        // Create an empty stack to keep track of nodes
    Stack<Node> stack = new Stack<>();

    // Start from the root of the BST
    Node node = this.root;
 
    // Continue as long as there are unprocessed nodes
    while (!stack.isEmpty() || node != null) {
        
        // Traverse to the leftmost node of the current subtree,
        // pushing all the nodes onto the stack
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
 
        // Process nodes from the stack when no left children
        node = stack.pop();
        
        // Decrement k after each processed node
        k -= 1;
 
        // If k reaches 0, return the current node value
        if (k == 0) {
            return node.value;
        }
 
        // Move to the right child after a node has been processed
        node = node.right;
    }
 
    // Return null if fewer than k nodes in the tree
    return null;

}




