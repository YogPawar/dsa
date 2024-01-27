### Array: Remove Duplicates ( ** Interview Question)
The task is to write a method named removeDuplicates, that removes all duplicate occurrences of integers from a sorted array in-place such that each unique element appears only once.

The relative order of the elements should be kept the same.

The method also needs to return the new length of the array after duplicates have been removed. It's important to note that the array is passed by reference to the function, which means modification to the array will be known to the caller as well.



Method Signature

public static int removeDuplicates(int[] nums)


This method takes as input an array of integers nums and returns an integer.



Input

An array of integers nums that are sorted in ascending order.



Output

Modifies the input array nums in-place to remove duplicate elements.

Returns an integer that is the new length of the array after duplicates have been removed.



Example

For example, if the input array is {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, the method should modify the array to {0, 1, 2, 3, 4} and return 5.



Additional Notes

The method removeDuplicates should do this by moving the 'unique' elements to the start of the array, and then returning the length of the 'unique' portion of the array.

The method should not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory (this means you cannot use another data structure like a set).

When the array is empty, the method should return 0.



Please ensure your solution handles these cases correctly.

### Hint
Pseudo Code:

Check if the length of the array nums is 0. If true, return 0, as an empty array has no elements to process.

Initialize a variable writePointer to 1. This pointer will indicate the position where the next unique number should be written.

Iterate over the array nums starting from the second element (index 1), using a for loop with readPointer representing the current index.

Inside the loop:

4.1. Check if the current number nums[readPointer] is different from the previous number nums[readPointer - 1]. If true, write the current number to the position indicated by writePointer, then increment writePointer.

After the loop ends, return writePointer. The value of writePointer is the length of the array without duplicates, as it points to the first unused index in the array.


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
 
        int writePointer = 1;
 
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
 
        return writePointer;
    }




The removeDuplicates method is used to remove duplicate elements from a sorted array nums in-place, and return the new length of the array after the removal of duplicates. "In-place" means it doesn't create a new array to hold the result, but instead modifies the original array.

Here's how it works:

First, it checks if the length of the array nums is 0, which means that the array is empty. If it is, the method returns 0 because there are no elements to process.

Next, it initializes a variable writePointer at index 1. This variable will keep track of the position where the next non-duplicate number should be written.

Then, it starts a loop with another variable readPointer, which also begins at index 1. This variable will be used to scan through the array. The reason why both pointers start at 1 (not 0) is because this method assumes the array is sorted, and therefore the first element cannot be a duplicate.

Inside the loop, it checks whether the current number (nums[readPointer]) is the same as the previous number (nums[readPointer - 1]). If they are the same, this means the current number is a duplicate and it is skipped.

If they are not the same, it means the current number is not a duplicate. In that case, the method writes the current number at the writePointer position (nums[writePointer] = nums[readPointer]), and then increments writePointer by 1 (writePointer++).

This process continues until the loop has scanned through the whole array. By the end, all the non-duplicate numbers have been moved to the front of the array, and writePointer is pointing at the position after the last non-duplicate number.

Finally, the method returns writePointer, which represents the new length of the array after duplicates have been removed.





Code with inline comments:



    public static int removeDuplicates(int[] nums) {
        // Check if the array is empty. If so, return 0.
        if (nums.length == 0) {
        return 0;
        }

        // Initialize the write pointer at the first index.
        int writePointer = 1;
     
        // Loop through the array starting from the second element.
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            // If the current element isn't a duplicate of the previous one
            if (nums[readPointer] != nums[readPointer - 1]) {
                // Write it at the position of the write pointer.
                nums[writePointer] = nums[readPointer];
                // Then, move the write pointer one step forward.
                writePointer++;
            }
        }
     
        // Return the position of the write pointer. This is the length of the 
        // array without duplicates.
    return writePointer;
}
