package com.misc.binarysearch;

public class BinarySearch {

  public static void main(String[] args) {
    int[] nums = {1, 3, 4, 5, 6, 7, 8, 9};
    System.out.println("Element Present at index : " + search(nums, 8));

  }

  private static int search(int[] nums, int data) {
    return search(nums, data, 0, nums.length - 1);
  }

  private static int search(int[] nums, int data, int lowIndex, int heighIndex) {
    //calculate the mid index
    int mid = lowIndex + (heighIndex - lowIndex) / 2;
    if (lowIndex > heighIndex) {
      return -1;
    }
    if (nums[mid] == data) {
      return mid;
    }
    if (nums[mid] < data) {
      return search(nums, data, mid + 1, heighIndex);
    } else if (nums[mid] > data) {
      return search(nums, data, lowIndex, mid - 1);
    }
    return -1;
  }

}
