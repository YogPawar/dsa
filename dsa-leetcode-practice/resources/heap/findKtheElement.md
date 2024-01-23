### <> Heap: Kth Smallest Element in an Array Implement a method in Java named findKthSmallest.

This method takes two parameters as input: an array of integers nums and an integer k. The array nums can have both positive and negative integers and can be of any size. The integer k is guaranteed to be in the range of 1 to the length of the array inclusive.

Your task is to find the kth smallest element in the array nums. In other words, if the elements of the array were sorted in ascending order, the element at the kth position (1-indexed) is the output.

Here's the method signature you'll be implementing:

public static int findKthSmallest(int[] nums, int k);


Input:

The first parameter is an array of integers, nums. The array may contain duplicate elements.

The second parameter is an integer, k (1 ≤ k ≤ nums.length). This is the position of the element to return if the array was sorted in ascending order.

Output:

The function must return the kth smallest element in nums.

Constraints:

You must use a MaxHeap to solve this problem. A Heap class is already provided for you, and you can use its methods to add elements to the heap (insert), remove the maximum element (remove), and get the current size of the heap (getHeap().size()).

Your solution should aim for a time complexity better than O(n log n), which would be the case if you sorted the array.

Example:

Here's a quick example of what we're looking for:

int[] nums = {7, 10, 4, 3, 20, 15};
int k = 3;
System.out.println(findKthSmallest(nums, k));  // Output: 7


In the above example, the kth smallest element is 7, which is the 3rd smallest number in the array.

Note: You should consider whether your solution handles edge cases, such as an array of length 1 or when all elements in the array are the same.


### Hind

Pseudo Code:

Start the findKthSmallest method, which takes an integer array nums and an integer k as arguments.

Create an instance of the Heap class called maxHeap. The Heap class is a representation of a max heap data structure, which is a binary tree where the root node is the maximum element and each child node is less than or equal to its parent node.

Loop through each number num in the nums array.

3.1 Insert the number num into maxHeap using the insert method. This method places the number in the correct position in the heap to maintain the max heap property.

3.2 If the size of maxHeap (obtained by calling maxHeap.getHeap().size()) exceeds k, call the remove method on maxHeap to remove the maximum element from the heap. This ensures that maxHeap only contains the k smallest elements in nums at any time.

After the loop, call the remove method on maxHeap once more and return the result. At this point, maxHeap contains the k smallest elements in nums, so the maximum element in maxHeap is the kth smallest element in nums.



This algorithm leverages the properties of a max heap to efficiently find the kth smallest element in nums. By maintaining a max heap of size k, we ensure that the heap only contains the k smallest elements seen so far, and that the maximum element in the heap is the kth smallest element. This approach avoids the need to sort nums or to maintain a heap of all elements in nums, resulting in significant time and space efficiency.



### Solution Explnation 

The findKthSmallest function takes two inputs, an array of integers nums, and an integer k. The goal of this function is to return the kth smallest number in the nums array. The function achieves this by using a max heap data structure.

Here's how it works:

Heap maxHeap = new Heap(); - This line creates an instance of a Heap. In the context of this function, this heap is going to be used as a max heap, which is a complete binary tree where each parent node is greater than or equal to its child nodes.

for (int num : nums) {...} - This line starts a for-each loop that iterates through each integer num in the input array nums.

maxHeap.insert(num); - This line inserts the current integer num into the max heap. The insert method of the Heap class ensures that the heap property is maintained after insertion, meaning that each parent node is still greater than or equal to its child nodes.

if (maxHeap.getHeap().size() > k) {...} - This line checks if the number of elements in the max heap is greater than k. This is an essential step because we only want to keep the smallest k elements in the heap.

maxHeap.remove(); - If the size of the heap is greater than k, this line removes the maximum element from the heap. In a max heap, the maximum element is always at the root of the heap. The remove method also ensures that the heap property is maintained after the removal.

After the loop has finished executing, all the smallest k numbers from the array are in the heap. The root of the heap is the kth smallest number because there are k-1 numbers that are smaller in the heap.

return maxHeap.remove(); - This line removes and returns the maximum element from the max heap, which is the kth smallest number in the original array.



This implementation is efficient because it avoids sorting the entire array or maintaining a full-size heap. It instead keeps a max heap of size k, which contains the smallest k numbers seen so far. This makes it easy to find the kth smallest number in constant time once the heap is built.


