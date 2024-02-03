### Array: Max Sub Array ( ** Interview Question)

You have been asked to create a method in Java, maxSubarray, that finds the contiguous subarray (
containing at least one number) which has the largest sum and returns its sum.

Method Signature

public static int maxSubarray(int[] nums)

This method takes as input an array of integers nums and returns an integer representing the maximum
sum of a contiguous subarray within the input array.

Input

An array of integers nums

Output

An integer that represents the maximum sum of a contiguous subarray within the input array.

Example

For example, if the input array is {-2, 1, -3, 4, -1, 2, 1, -5, 4}, the method should return 6 as
the subarray with the maximum sum is {4, -1, 2, 1} which sums to 6.

Note

A subarray is a contiguous part of an array. In other words, a subarray is a sequence of elements
that are in direct succession in the array, with no elements from the array skipped or interspersed.

You need to find a contiguous subarray with the largest sum. This subarray could be the entire
array, or it could be a smaller part of the array. It could include negative numbers, but the sum of
the subarray must be maximized.

You can assume that the input array is non-empty and contains at least one number.

### Hint
Pseudo Code:

Check if the input array nums is empty. If it is, return 0 as there's no subarray in an empty array.

Initialize two integer variables, maxSum and currentSum, to the first element of the array nums[0]. maxSum will keep track of the maximum sum we've found so far, while currentSum will keep track of the current subarray sum.

Iterate over the array starting from the second element. For each element nums[i], update currentSum to be the larger of nums[i] and currentSum + nums[i]. This effectively chooses if it's better to start a new subarray at nums[i] or extend the current subarray to include nums[i].

Update maxSum to be the maximum of maxSum and currentSum. This ensures that maxSum always stores the maximum subarray sum we've seen so far.

Repeat steps 3-4 for each element in the array.

After iterating through the entire array, return maxSum. This will be the maximum sum of any subarray in the input array.

This algorithm, known as Kadane's algorithm, runs in linear time (O(n) where n is the size of the array) and constant space (O(1)), and is the most efficient solution for this problem.

### Solution

    public static int maxSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
 
        int maxSum = nums[0];
        int currentSum = nums[0];
 
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
 
        return maxSum;
    }




The maxSubarray function calculates the maximum sum of all contiguous subarrays in the provided array. This problem is a classic computer science problem known as the Maximum Subarray Problem.

The function uses the Kadane's algorithm, which is an efficient method to solve this problem with a time complexity of O(n).

Here is a detailed explanation:

If the array nums is empty, the function returns 0, since there are no elements to add together.

The function initializes two integer variables, maxSum and currentSum, with the first element of the array nums. maxSum keeps track of the maximum subarray sum encountered so far, and currentSum keeps track of the current contiguous subarray sum.

The function then loops through the array from the second element to the end (since the first element is already considered in maxSum and currentSum).

For each element in the loop, the function updates currentSum to be the maximum of the current element and the sum of the current element and the previous currentSum. The function uses the Math.max function to choose the larger of these two options. This step essentially decides whether to extend the previous subarray or start a new one.

The function also updates maxSum to be the maximum of the current maxSum and currentSum, effectively updating the maximum subarray sum if a larger sum has been found.

After going through all the elements, the function returns maxSum, which by now holds the maximum sum of all possible contiguous subarrays of nums.



This approach works because it iteratively checks all possible subarrays by either extending the previous subarray or starting a new one, and keeps track of the maximum sum found so far.

This method is a dynamic programming approach because it breaks the problem down into smaller subproblems (the maximum sum ending at each position), and uses the solutions to these subproblems to find the solution to the larger problem (the maximum subarray sum overall).





Code with inline comments:



    public static int maxSubarray(int[] nums) {
        // Check if the array is empty, return 0
        if (nums.length == 0) {
        return 0;
        }

        // Initialize the maximum sum and current sum with the first element
        int maxSum = nums[0];
        int currentSum = nums[0];
     
        // Loop through the rest of the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the current sum to be the larger between the current number
            // and the current sum added with the current number
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum to be the larger between the old maximum sum
            // and the updated current sum
            maxSum = Math.max(maxSum, currentSum);
        }
     
        // After the loop, return the maximum sum found
        return maxSum;
    }


