### LL: Binary to Decimal ( ** Interview Question)
Objective:

You have a linked list where each node represents a binary digit (0 or 1). The goal of the binaryToDecimal function is to convert this binary number, represented by the linked list, into its decimal equivalent.



Function Signature:

public int binaryToDecimal()



How Binary to Decimal Conversion Works:

In binary-to-decimal conversion, each position of a binary number corresponds to a specific power of 2, starting from the rightmost digit.

The rightmost digit is multiplied by 2^0 (which equals 1).

The next digit to the left is multiplied by 2^1 (which equals 2).

The digit after that is multiplied by 2^2 (which equals 4). ... and so on.

To find the decimal representation:

Multiply each binary digit by its corresponding power of 2 value.

Sum up all these products.



Example Execution with Binary 101:

Start with num = 0.

Process 1 (from the head of the linked list): num = 0 * 2 + 1 = 1

Process 0: num = 1 * 2 + 0 = 2

Process 1: num = 2 * 2 + 1 = 5

Return num, which is 5.



Steps Involved in the Function:

A variable num is initialized to 0, which will store our computed decimal number.

Starting from the head of the linked list (the leftmost binary digit), iterate through each node until the end.

For every node, double the current value of num (this is analogous to shifting in binary representation). Then, add the binary digit of the current node.

Move to the next node and repeat until you've visited all nodes.

Return the value in num, which now represents the decimal value of the binary number in the linked list.

### Hint

Pseudo Code:

1. Start with a variable called 'num' and set it to 0.

   This will store our resulting decimal number.



2. Create a pointer called 'current' and set it to point to the start of the linked list (the head).



3. Begin a loop. Continue this loop as long as 'current' is not pointing to nothing (i.e., as long as we haven't reached the end of the list).



a. Inside the loop, the first step is to double the current value of 'num'.

      This is like making space for the next binary digit.

      Imagine we are reading a binary number from left to right.

      Each time we move to the next position, we're shifting everything

      to the left, which is equivalent to doubling in the binary system.



b. Add the value of the node that 'current' is pointing to, to 'num'.

      This value will be either 0 or 1 since it's a binary digit.

      Now 'num' contains the accumulated value up to the current binary digit.



c. Move the 'current' pointer to the next node in the list to continue

      the loop for the next binary digit.



4. Once the loop finishes (we've processed all binary digits), return the value of 'num' which now contains the decimal representation of the binary number in the linked list.

## Solution

    public int binaryToDecimal() {
        int num = 0;
        Node current = head;
        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
    }




The method aims to convert a binary number, represented by the linked list, into its decimal form. Here's a breakdown:



Step 1: Initialize Variables

int num = 0;
Node current = head;
num: This variable will hold the decimal equivalent of the binary number. It is initialized to zero.

current: This variable points to the head node of the linked list initially. We'll traverse through the list using this variable.



Step 2: Traverse Through the Linked List

while (current != null) {
num = num * 2 + current.value;
current = current.next;
}
The while loop runs as long as current is not null, meaning that we have not yet reached the end of the linked list.

Inside the loop:

num = num * 2 + current.value;: This statement performs the core logic for binary to decimal conversion. For each binary digit in the linked list, we multiply the current value of num by 2 (essentially performing a bit-shift to the left by one position), and add the value of the current node (current.value).

current = current.next;: This moves current to the next node in the list.



Step 3: Return the Result

return num;
Once the loop has traversed all nodes, the final decimal value is stored in num. This value is then returned.



Summary

The method iterates through the linked list from the head to the tail, treating each node's value as a digit in a binary number. It then performs the binary to decimal conversion, starting from the most significant bit (MSB) down to the least significant bit (LSB), and finally returns the decimal number.





Code with inline comments:



    // Define the binaryToDecimal method for the LinkedList class
    public int binaryToDecimal() {
    // Initialize an integer variable 'num' to 0.
    // This variable will hold the decimal value of the binary number.
    int num = 0;

    // Initialize a Node variable 'current' to point to the head of the LinkedList.
    // We will use 'current' to traverse through the LinkedList.
    Node current = head;
 
    // Begin a while loop that continues as long as 'current' is not null.
    // A null 'current' would mean we've reached the end of the LinkedList.
    while (current != null) {
 
        // For each node, shift the existing 'num' value one binary place to the left
        // by multiplying it by 2. Then, add the value of the current node to it.
        // This will build our binary number into its decimal equivalent,
        // one bit at a time.
        num = num * 2 + current.value;
 
        // Move to the next node in the LinkedList.
        // 'current.next' will either point to the next node, or to null
        // if we've reached the end of the list.
        current = current.next;
    }
 
    // After the loop, return the decimal value stored in 'num'.
    return num;
}




Explanation Using Decimal as an Analogy:

Constructing a Decimal Number: 123

Concept: Every position in a decimal number represents a power of 10, starting from the rightmost position as 100100 (which is 1) and increasing to the left.



Initialize:

Start with a result of 0.

Process the leftmost digit (1):

Multiply the current result by 10 (since we're in base 10): result = 0 * 10 = 0

Add the current digit: result = 0 + 1 = 1

Process the next digit (2):

Multiply the current result by 10: result = 1 * 10 = 10

Add the current digit: result = 10 + 2 = 12

Process the rightmost digit (3):

Multiply the current result by 10: result = 12 * 10 = 120

Add the current digit: result = 120 + 3 = 123

Conclusion:

At the end of this process, we've constructed the decimal number 123.



Now, let's construct a binary number using the same method. We'll use the binary number 110 as an example.



Constructing a Binary Number: 110

Concept: Every position in a binary number represents a power of 2, starting from the rightmost position as 2020 (which is 1) and increasing to the left.



Initialize:

Start with a result of 0.

Process the leftmost binary digit (1):

Multiply the current result by 2 (since we're in base 2): result = 0 * 2 = 0

Add the current binary digit: result = 0 + 1 = 1

Process the next binary digit (1):

Multiply the current result by 2: result = 1 * 2 = 2

Add the current binary digit: result = 2 + 1 = 3

Process the rightmost binary digit (0):

Multiply the current result by 2: result = 3 * 2 = 6

Add the current binary digit: result = 6 + 0 = 6

Conclusion:

At the end of this process, we've converted the binary number 110 into the decimal number 6.



Both of these step-by-step processes follow the general principle of constructing numbers in positional notation. The only difference between them is the base: base-10 for decimal and base-2 for binary.





