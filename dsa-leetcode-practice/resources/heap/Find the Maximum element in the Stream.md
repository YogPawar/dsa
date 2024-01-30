### <> Heap: Maximum Element in a Stream

Implement a function named streamMax that processes a stream of integers and returns the maximum
number encountered so far for each input number.

This function should take in an array of integers and return a list of integers.

Given an array of integers, your function should iterate over the array and for each number, it
should find the maximum number in the array up until that point, including the current number.

The streamMax function has the following signature:

public static List<Integer> streamMax(int[] nums)

It accepts one parameter:

nums (an array of integers): An array of integers for each i from 0 to nums.length - 1.

The function should return:

A list of integers: The i-th integer in the list should be the maximum number among the first i
numbers in the input array nums (1-indexed).

Here are some examples to demonstrate the expected behavior of the streamMax function:

Example 1:

int[] nums = {1, 5, 2, 9, 3, 6, 8};
List<Integer> result = streamMax(nums);
// Expected output: [1, 5, 5, 9, 9, 9, 9]
// Explanation: The maximum number for the first number is 1,
// for the first two numbers is 5, for the first three numbers is 5, and so on.

Example 2:

int[] nums = {10, 2, 5, 1, 0, 11, 6};
List<Integer> result = streamMax(nums);
// Expected output: [10, 10, 10, 10, 10, 11, 11]
// Explanation: The maximum number for the first number is 10,
// for the first two numbers is 10, for the first three numbers is 10, and so on.

Example 3:

int[] nums = {3, 3, 3, 3, 3};
List<Integer> result = streamMax(nums);
// Expected output: [3, 3, 3, 3, 3]
// Explanation: Since all numbers are the same,
// the maximum number for any prefix of the input array is always 3.

### Hint

Pseudo Code:

Define the function streamMax that takes an array of integers nums as input.

Inside the function, create an instance of Heap named maxHeap.

Also create an empty list of integers maxStream to store the maximum elements encountered so far in
the stream.

Start a loop for each num in nums:

4.1. Call maxHeap.insert(num). This method inserts the num into maxHeap and ensures that the maximum
element is at the root of the maxHeap.

4.2. Once the num is inserted, the maximum element so far in the stream (which is at the root of the
heap) is added to maxStream. This is done by calling maxHeap.getHeap().get(0).

After the loop ends (we've processed all elements in the input), return the list maxStream.
maxStream is a list where the i-th element is the maximum element among the first i elements in the
input array nums.

### Solution Explnations

The method streamMax is defined as a public and static method, which means it can be accessed and
called directly from the class without needing to instantiate an object of the class. It accepts an
array of integers (nums) as an argument and returns a list of integers.

Inside the method, a new Heap object is created and assigned to the variable maxHeap. This Heap
object is a max-heap data structure, where the largest element is always at the root of the heap.

A new, empty ArrayList of integers is created and assigned to the variable maxStream. This list will
be used to store the maximum number encountered so far in the array at each step of iteration.

The method then enters a for loop which iterates over each integer (num) in the input array (nums).

On each iteration, the current integer (num) is inserted into the maxHeap by calling maxHeap.insert(
num). The insert operation ensures that the max-heap property is maintained, i.e., the maximum
element of the heap (or array so far) is always at the root.

After the insertion, the method adds the current maximum element to the maxStream list. This is done
by calling maxHeap.getHeap().get(0), which retrieves the root of the heap (i.e., the current
maximum).

After all the integers in nums have been processed, the method returns the maxStream list. This list
contains the maximum elements encountered so far in the stream at each step.

In summary, the streamMax method generates and returns a list that represents the running maximum of
a stream of numbers. For each number in the input array, it gives the maximum number encountered so
far.

Code with inline comments;

    public static List<Integer> streamMax(int[] nums) {
   
    //Create an instance of a max-heap;

      Heap maxHeap = new Heap();

    // Prepare a list to store the max of the stream so far
    List<Integer> maxStream = new ArrayList<>();
 
    // For each number in the given array
    for (int num : nums) {
        // Insert the current number into the max-heap
        maxHeap.insert(num);
        
        // After insertion, the max of the heap (which is also
        // the max of the stream so far) is at the root. Add this
        // root to the maxStream list
        maxStream.add(maxHeap.getHeap().get(0));
    }
 
    // After iterating over all the numbers, return the maxStream list
    // that contains the running maximum of the input stream
    return maxStream;

}



