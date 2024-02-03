### Array: Rotate ( ** Interview Question)

You are tasked with implementing a method, rotate, that rotates an array to the right by k steps,
where k is a non-negative integer.

Method Signature

public static void rotate(int[] nums, int k)

This method takes as input an array of integers nums and a non-negative integer k, and rotates the
array in-place.

Input

An array of integers nums (you can assume the array is not empty)

A non-negative integer k, which represents the number of steps the array should be rotated.

Output
This function does not return anything. It modifies the input array nums in-place to rotate it to
the right by k steps.

Example

For example, if the input array is {1, 2, 3, 4, 5, 6, 7} and k = 3, the method should rotate the
array to become {5, 6, 7, 1, 2, 3, 4}.

Note

Rotation is performed in steps. For each step, the last element of the array is moved to the front,
and all other elements are moved one step to the right.

The number of rotations is equal to k mod n, where n is the length of the array. This is because
after n rotations, the array would return to its original state.

The rotation should be performed in-place, i.e., without making a copy of the original array (except
for temporary variables).

Your solution should run efficiently, ideally with a linear time complexity and constant space
complexity.

### Hint

Pseudo Code:

Modulate the input k by the length of the input array nums. This is to handle the cases where k is
larger than the size of the array, as rotating by the array length doesn't change the array.

Reverse the first part of the array, from the first element to the (array length - k - 1)th element.
You can achieve this by initializing two pointers: one at the start and one at the end = nums.length
- k - 1. Then, swap the elements pointed by start and end, and increment start and decrement end
until start < end.

Reverse the second part of the array, from the (array length - k)th element to the last element.
Similar to step 2, initialize two pointers: start at nums.length - k and end at nums.length - 1.
Swap the elements pointed by start and end, and increment start and decrement end until start < end.

Reverse the whole array. Again, initialize two pointers: start at 0 and end at nums.length - 1. Swap
the elements pointed by start and end, and increment start and decrement end until start < end.

Now, the array nums has been rotated by k steps to the right.

Note that the input array is modified in-place, meaning the rotation happens on the original array
without creating a new one.

This algorithm uses the principle of reversing parts of the array to achieve the rotation effect in
a time complexity of O(n) where n is the size of the array, and constant space complexity (O(1))
since no additional data structures are used.

Explained another way:

Let's imagine you have a long line of your favorite LEGO blocks, and you've numbered each of them.
Now, let's say your best friend asks you to move some of the blocks from the start of the line to
the end, but in a very special way. They want the order to stay the same as much as possible.

This is similar to how our rotate function works! Here's how it happens:

First, we're going to calculate the real number of movements we need to make. We do this by
calculating k (the number your friend gave) modulo the number of blocks (nums.length). This is like
dividing k by nums.length and getting the remainder. This is because if k is bigger than the number
of blocks, we don't need to do extra full loops.

Now we start the moving. We divide the line into two parts: the blocks that will be moved (k) and
the rest. Then, we're going to do three steps:

Reverse the first part: We swap the first and the last block in this part, then the second and the
second last, and so on... until we reach the middle of this part.

Reverse the second part: We do the same with the second part. We swap the first and the last block,
then the second and the second last, and so on...

Reverse the whole line: Finally, we reverse the entire line of blocks.

Now, if you look at your blocks, they are arranged just as your friend wanted!

And that's it! We use a for loop for each step to make sure we check and swap every block in the
part or line we're working with. After we're done, the rotate function doesn't return anything
because it changes the order of blocks in the original line (or in programming terms, the original
array), not creating a new one.

### Solution

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
 
        // Reverse the first part
        for (int start = 0, end = nums.length - k - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
 
        // Reverse the second part
        for (int start = nums.length - k, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
 
        // Reverse the whole array
        for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }

The rotate method rotates the elements of an array to the right by k steps. The number of steps, k,
is first reduced by taking the modulus with the array's length. This is because if k is larger than
the array's length, we only need to consider k modulo the length of the array as the rest of the
rotations will just cycle the array back to its original configuration.

The method uses a clever trick to perform the rotation in-place (i.e., without needing extra space).

Here's how it works:

The method first reverses the first part of the array, from the first element to the (length - k -
1)th element. It does this by swapping the first and last elements of this section, then the second
and second-to-last elements, and so on until it meets in the middle.

The method then reverses the second part of the array, from the (length - k)th element to the last
element. It does this in the same way as the first part.

Now the array is in a state where the first part and the second part are each reversed, but the
entire array is not yet in the correct order. So the method reverses the entire array. After this
step, the elements are now in their correctly rotated positions.

The reason this works is because reversing sections of the array and then the entire array has the
effect of rotating the elements. This method is more efficient than a naive approach that would
shift the elements one-by-one, which would take more time for large k.

This algorithm has a time complexity of O(n), as every element in the array is visited once, and the
space complexity is O(1) because no additional space is required.

Code with inline comments:

    public static void rotate(int[] nums, int k) {
        // Reduce k to its equivalent value within array length range.
        k = k % nums.length;
    
        // Reverse the first part of the array (from start to length-k)
        for (int start = 0, end = nums.length - k - 1; start < end; start++, end--) {
            // Swap elements at positions 'start' and 'end'
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
     
        // Reverse the second part of the array (from length-k to end)
        for (int start = nums.length - k, end = nums.length - 1; start < end; start++, end--) {
            // Swap elements at positions 'start' and 'end'
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
     
        // Reverse the whole array
        for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
            // Swap elements at positions 'start' and 'end'
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }








