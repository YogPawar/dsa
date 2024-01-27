### Array: Remove Element ( ** Interview Question)
In this problem, we are given an array of integers nums and a value val. The goal is to remove all occurrences of val in-place from the array and return the new length of the array after removal.

The method removeElement(int[] nums, int val) takes an array of integers nums and an integer val as input. It modifies the nums array in-place to remove all instances of val and returns the new length of nums after the removal.

It's important to note that the order of elements can be changed. We don't need to consider elements beyond the new length.

For example, given nums = [3,2,2,3] and val = 3, the method should return 2, and the first two elements of nums should be 2.



Method Signature:

public static int removeElement(int[] nums, int val)


Constraints

The array nums can contain negative and positive numbers, and 0.



Example

Let's illustrate the problem using an example:

Input:

nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

val = 1

Output: The new length of the array should be 7, and the array itself should look like this after modification: [-2, -3, 4, -1, 2, -5, 4, -5, 4]



We iterate over the nums array and, whenever we encounter a number that is not equal to val, we shift it to the front of the array. By doing this, we can effectively remove all occurrences of val from the array and get the new length.

### Hint

Pseudo Code:

Initialize an index i to 0. This will track the position in the array where we can place an element that is not equal to val. This also represents the new length of the array after all occurrences of val have been removed.

Start a loop where j iterates from 0 to the length of the array:

2.1. Check if the element at index j in the array is not equal to val.

2.2. If true, assign the value at index j to the value at index i in the array, and then increment i by 1.

Return the new length i after the loop ends. This represents the length of the array after all occurrences of val have been removed.

### Solution

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
            nums[i] = nums[j];
            i++;    
            }
        }
    return i;
    }




This method, removeElement, is designed to "remove" all instances of a specific value (val) from an array of integers (nums). However, the removal process doesn't actually delete the elements from the array itself. It rather reorganizes the array so that all the elements that are not equal to val are moved to the front of the array.

Here's how it works:

We initialize a variable i at 0. This variable is used to keep track of the position where we would put the next number that is not equal to val.

We then use a for loop to traverse through the nums array. The loop variable j is initialized to 0 and runs up to nums.length - 1, which are the index positions of the array.

Inside the for loop, we use an if statement to check whether the current element of the array nums[j] is not equal to val.

If nums[j] is not equal to val, we assign the value of nums[j] to nums[i] and increment i by 1. This effectively "moves" the value from position j to position i, ensuring that val is not in the first i elements of the array.

If nums[j] is equal to val, we do nothing and just move to the next element in the array. This effectively "skips" the unwanted val elements.

Once the loop finishes traversing through all the elements in the array, the first i elements of nums are all the elements which are not equal to val, and the elements from position i to the end of the array are unchanged.

Finally, the function returns i, which is the number of elements that are not equal to val.



This is useful if you want to use this array later, but you want to ignore the "removed" values. This function gives you the effective length of the new array (i), and you would only process the array up to that length.

Let's consider an example: If the nums array is [3,2,2,3] and val is 3, then after running this function, the nums array will become [2,2,3,3] and the function will return 2. So the first 2 elements of nums are all the elements which are not 3, and you would ignore the rest of the array.





Code with inline comments:



    public static int removeElement(int[] nums, int val) {
    // Initialize index i for writing elements in the array
    int i = 0;

    // Traverse the array from the start to end
    for (int j = 0; j < nums.length; j++) {
        // If the current element is not equal to the given value...
        if (nums[j] != val) {
            // ...copy it to the position of the 'write' index i...
            nums[i] = nums[j];
            // ...and increment the write index
            i++;
        }
        // If the current element equals val, it is skipped
    }
    
    // Return the number of elements not equal to val
    return i;
}


