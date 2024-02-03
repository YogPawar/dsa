### Stack: Sort Stack ( ** Interview Question)

The sortStack method takes a single argument, a Stack object. The method should sort the elements in
the stack in ascending order (the lowest value will be at the top of the stack) using only one
additional stack. The function should use the pop, push, peek, and isEmpty methods of the Stack
object.

This will use the Stack class we created in these coding exercises:

To sort the stack, you should create a new, empty stack to hold the sorted elements. Then, while the
original stack is not empty, you should remove the top element from the original stack and compare
it to the top element of the sorted stack. If the top element of the sorted stack is greater than
the current element, you should move the top element of the sorted stack back to the original stack
until the current element is in the correct position. Finally, you should add the current element to
the sorted stack.

Once all the elements have been sorted, you should copy the sorted elements from the sorted stack to
the original stack in the correct order.

Overall, the function should have a time complexity of O(n^2), where n is the number of elements in
the original stack, due to the nested loops used to compare the elements. However, the function
should only use one additional stack, which could be useful in situations where memory is limited.

### Hint

Pseudo Code:

Initialize additionalStack:

Create an empty stack called additionalStack.

Process the input stack:

While input stack is not empty, repeat the following steps:

Pop an element from the input stack and name it temp.

While additionalStack is not empty and its top element is greater than temp, pop the top element
from additionalStack and push it to the input stack.

Push temp to additionalStack.

Transfer sorted elements:

While additionalStack is not empty, pop the top element and push it to the input stack.

Put in Simpler Terms:

Imagine you have a stack of books and you want to arrange them in order of their height, from
shortest to tallest. But, you have no extra space, except for another pile that you can use
temporarily.

Here's how you can do it:

Take the top book (let's say this is our temp book) from the original pile (stack).

Look at the top book of your temporary pile (additionalStack), if it's taller than the temp book:

Move it back to the original pile.

Keep doing this until you find a book that's not taller than the temp book or until the temporary
pile is empty.

Then, put the temp book on the temporary pile.

Repeat steps 1-3 until your original pile is empty. Now, all your books are in the temporary pile,
but from tallest to shortest.

Finally, move all the books from the temporary pile back to the original pile, one by one.

Now your books are arranged in the original pile from shortest to tallest!

Additional Hints for Understanding sortStack Method:

Purpose of the Method:

What is the goal of the sortStack method?

What will be the state of the original stack after running this method?

Helper Stack:

Why do you think an additional stack (additionalStack) is being used here?

When is it initialized and what is its role?

First 'while' Loop:

What condition is checked in the first 'while' loop?

What do you think will happen inside this loop?

Variable temp:

What is the temp variable for?

Why are we popping an element from the original stack (stack) and storing it in temp?

Second 'while' Loop (Inner Loop):

What is the condition for the inner 'while' loop?

Why do you think we have an inner 'while' loop inside the main 'while' loop?

Pushing and Popping:

What happens to elements that are popped from additionalStack?

Why are they pushed back into the original stack (stack)?

Placing temp:

When and why do we push the temp variable into additionalStack?

Final 'while' Loop:

Why is there another 'while' loop after the main 'while' loop?

What does it do with additionalStack?

Stack State:

After all these operations, what will the original stack (stack) look like?

How is it different from the original state of the stack?

Code Tracing:

Can you manually trace the code with a sample stack to see how each step is executed?

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> additionalStack = new Stack<>();
 
        while (!stack.isEmpty()) {
            int temp = stack.pop();
 
            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                stack.push(additionalStack.pop());
            }
 
            additionalStack.push(temp);
        }
 
        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
    }

Understanding Stacks

Firstly, it's important to understand that a stack is a data structure that follows the
Last-In-First-Out (LIFO) principle. This means the last element added to the stack is the first one
to be removed.

The Method: sortStack

The method sortStack is designed to sort a given stack using an additional temporary stack.

Parameters

stack: This is the main stack that needs to be sorted.

Process

Initialization:

An additional stack, additionalStack, is created. This stack will temporarily hold elements in
sorted order.

Sorting:

The method enters a loop that continues until the main stack is empty.

In each iteration, the top element (temp) from the main stack is popped.

Now, the method checks if the top element of the additionalStack is greater than temp. If it is,
those elements are popped from additionalStack and pushed back onto the main stack. This step is
repeated until a correct position for temp is found in additionalStack.

Then, temp is pushed into the additionalStack.

Rebuilding the Original Stack:

Once the main stack is empty, the elements from additionalStack (which are now sorted) are popped
and pushed back onto the main stack.

Example

Let's consider an example for clarity. Suppose our main stack (stack) has the elements [3, 1, 4, 2]
with 2 at the top.

Initialization:

additionalStack is created and is empty.

First Iteration:

    Pop from stack: temp = 2.

additionalStack is empty, so push temp (2) onto additionalStack.

stack has: [3, 1, 4]

Second Iteration:

    Pop from stack: temp = 4.

additionalStack has [2,], and 2 < 4. So, push temp (4) onto additionalStack.

stack has: [3, 1]

Third Iteration:

    Pop from stack: temp = 1.

additionalStack has [2, 4], and 4 > 1. So, pop 4 from additionalStack and push onto stack.

stack has: [3, 4]

Now additionalStack has [2], and 2 > 1. So, pop 2 from additionalStack and push onto stack.

Now additionalStack is empty, push temp (1) onto additionalStack.

After pushing temp (1) onto additionalStack, the states are:

stack has: [3, 4, 2]

additionalStack has: [1]

Fourth Iteration:

    Pop from stack: temp = 2.

additionalStack has [1], and 1 < 2. So, push temp (2) onto additionalStack.

After pushing temp (2) onto additionalStack, the states are:

stack has: [3, 4]

additionalStack has: [1, 2]

Fifth Iteration:

    Pop from stack: temp = 4.

additionalStack has [1, 2], and 2 < 4. So, push temp (4) onto additionalStack.

Now the states are:

stack has: [3]

additionalStack has: [1, 2, 4]

Sixth Iteration:

    Pop from stack: temp = 3.

additionalStack has [1, 2, 4], and 4 > 3. So, pop 4 from additionalStack and push onto stack. Now
stack has [4].

additionalStack now has [1, 2], and 2 < 3. So, push temp (3) onto additionalStack.

Now the states are:

stack has: [4]

additionalStack has: [1, 2, 3]

Rebuilding the Original Stack:

Now that the original stack is almost empty (except for the top element 4), we rebuild it by popping
elements from additionalStack and pushing them onto stack.

Pop 3 from additionalStack and push onto stack. Now stack has [4, 3].

Pop 2 from additionalStack and push onto stack. Now stack has [4, 3, 2].

Pop 1 from additionalStack and push onto stack. Now stack has [4, 3, 2, 1].

Final State:

The original stack is now sorted in descending order, with the final state being [4, 3, 2, 1].

additionalStack is empty.

So, the final sorted stack is [4, 3, 2, 1], where 1 is at the top. This sorting process ensures that
the largest elements are at the bottom of the stack and the smallest elements are at the top,
adhering to the Last-In-First-Out principle of the stack.

In the final sorted stack, the order of elements, from bottom to top, will be [1, 2, 3, 4], which
means 4 will be at the bottom and 1 will be at the top.

This method sorts the elements in ascending order in the original stack.

Code with inline comments:

    public static void sortStack(Stack<Integer> stack) {
        // Initialize an additional stack. This stack will be used to hold elements
        // temporarily and will help in sorting the elements of the original stack.
        Stack<Integer> additionalStack = new Stack<>();
    
        // Start a loop that will run until the original stack becomes empty.
        // This loop is responsible for moving elements from the original stack
        // to the additional stack in a sorted manner.
        while (!stack.isEmpty()) {
            // Pop the top element from the original stack. This element will be
            // compared with the elements in the additional stack to find its
            // correct position.
            int temp = stack.pop();
     
            // Check if the additional stack is not empty and the top element
            // in the additional stack is greater than the element we just popped
            // from the original stack. We need to move elements from the additional
            // stack back to the original stack until we find the correct position
            // for our popped element. This inner loop is critical to ensure that
            // the additional stack remains sorted at all times.
            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                // Move the top element of the additional stack back to the original
                // stack. This step is repeated until we find the right position for
                // the popped element in the additional stack.
                stack.push(additionalStack.pop());
            }
     
            // Now that the correct position is found in the additional stack,
            // push the popped element (temp) onto the additional stack. At this
            // point, the additional stack holds a sorted sequence of the elements
            // that have been processed so far.
            additionalStack.push(temp);
        }
     
        // After all elements are moved to the additional stack and sorted,
        // we need to move them back to the original stack. This final loop
        // reverses the order of the sorted elements, thereby arranging them
        // in ascending order in the original stack.
        while (!additionalStack.isEmpty()) {
            // Pop each element from the additional stack and push it onto
            // the original stack. This step will restore the elements to the
            // original stack but now in sorted order.
            stack.push(additionalStack.pop());
        }
    }
