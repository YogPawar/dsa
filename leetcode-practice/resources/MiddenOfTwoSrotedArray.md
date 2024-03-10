4. Median of Two Sorted Arrays
   Hard
   Topics
   Companies
   Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106








### Problem Understanding:
In simpler terms, you need to find the middle value of the combined, sorted array formed by merging nums1 and nums2. If the combined array has an even number of elements, you should return the average of the two middle values. If it has an odd number of elements, you should return the middle value itself.

Hint:
Can you observe the fact that the given arrays are sorted?
I would recommend you, don't jump directly on solution.

Approach 1: Merge and Sort
Create a new array with a size equal to the total number of elements in both input arrays.
Insert elements from both input arrays into the new array.
Sort the new array.
Find and return the median of the sorted array.
Time Complexity

In the worst case TC is O((n + m) * log(n + m)).
Space Complexity

O(n + m), where ‘n’ and ‘m’ are the sizes of the arrays.
Approach 2: Two-Pointer Method
Initialize two pointers, i and j, both initially set to 0.
Move the pointer that corresponds to the smaller value forward at each step.
Continue moving the pointers until you have processed half of the total number of elements.
Calculate and return the median based on the values pointed to by i and j.
Time Complexity

O(n + m), where ‘n’ & ‘m’ are the sizes of the two arrays.
Space Complexity

O(1).
Approach 3: Binary Search
Use binary search to partition the smaller of the two input arrays into two parts.
Find the partition of the larger array such that the sum of elements on the left side of the partition in both arrays is half of the total elements.
Check if this partition is valid by verifying if the largest number on the left side is smaller than the smallest number on the right side.
If the partition is valid, calculate and return the median.
Time Complexity

O(logm/logn)
Space Complexity

O(1)