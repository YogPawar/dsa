package com.leetcode.array.medium;

public class FindRoatedArray {

  public static void main(String[] args) {
    //[4,5,6,7,0,1,2]
    System.out.println("Use Case 1: [4,5,6,7,0,1,2] target : 0");
    int[] nums = {4, 5, 6, 0, 1, 2};
    System.out.println("Element found at index : " + search(nums, 0));

    System.out.println("Use Case 2: [6,7,8,9,10,11] target : 10");
    int[] nums1 = {6, 7, 8, 9, 10, 11};
    System.out.println("Element found at index : " + search(nums1, 10));

    System.out.println("Use Case 3: [11,10,9,8,7,6] target : 10");
    int[] nums2 = {11, 10, 9, 8, 7, 6};
    System.out.println("Element found at index : " + search(nums2, 10));
  }

  private static int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1; //5
    while (low <= high) {
      //calculate the mid
      int mid = (low + high) / 2;

      //target found at nums[mid] then return the index
      if (nums[mid] == target) {
        return mid;
      }

      if (nums[low] <= nums[mid]) {
        if (nums[low] <= target && target < nums[mid]) {
          //rest the high to mid -1
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        if (nums[mid] > target && target <= nums[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return -1;
  }
}
