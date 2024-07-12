package com.dsa.array;

import java.util.Arrays;

public class ReverseArray {

  private static int[] reverseArray(int[] numbers) {
    //swap last with first, second last with second and so on
    return reverse(numbers, 0, numbers.length - 1);
  }

  private static int[] reverse(int[] array, int firstIndex, int lastIndex) {
    //base condition to stop the swaping
    if (firstIndex > lastIndex) {
      return array;
    } else {
      //swap the element and firstIndex++ and lastIndex--
      int temp = array[firstIndex];
      array[firstIndex] = array[lastIndex];
      array[lastIndex] = temp;
      return reverse(array, firstIndex + 1, lastIndex - 1);
    }
  }

  //constant space complexity
  private static int[] reverseNumArray(int[] nums) {
    int lastIndex = nums.length - 1;
    int firstIndex = 0;
    while (firstIndex < lastIndex) {
      int temp = nums[firstIndex];
      nums[firstIndex] = nums[lastIndex];
      nums[lastIndex] = temp;
      firstIndex += 1;
      lastIndex -= 1;
    }
    return nums;
  }

  public static void main(String[] args) {
    System.out.println(
        "Case 1 : {1,2,3,4,5,6} : \t" + Arrays.toString(
            reverseNumArray(new int[]{1, 2, 3, 4, 5, 6})));
    System.out.println(
        "Case 2 : {1,2,3,4,5} :\t" + Arrays.toString(reverseNumArray(new int[]{1, 2, 3, 4, 5})));
    System.out.println(
        "Case 3 : {1} : \t" + Arrays.toString(reverseNumArray(new int[]{1})));
    System.out.println(
        "Case 4 : {1,2} : \t" + Arrays.toString(reverseNumArray(new int[]{1, 2})));
  }
}
