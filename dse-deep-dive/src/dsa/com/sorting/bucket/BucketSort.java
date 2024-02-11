package dsa.com.sorting.bucket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

  public static void main(String[] args) {
    int[] input = {72, 37, 22, 12, 35, 32, 56, 55, 87, 78};
    sort(input);
    System.out.println(Arrays.toString(input));
  }

  private static void sort(int[] input) {
    List<Integer>[] bucket = new List[10];

    createBucket(bucket); //create bucket to store the element

    insertIntoBucket(bucket, input); //insert the array element into different bucket

    sortBucketElement(bucket); //sort the inserted element from the bucket

    mergeBucket(bucket, input); //merge the sorted bucket

  }

  private static void createBucket(List<Integer>[] bucket) {
    for (int i = 0; i < bucket.length; i++) {
      bucket[i] = new ArrayList<>();
    }

  }


  private static void mergeBucket(List<Integer>[] bucket, int[] input) {
    int j = 0;
    for (int i = 0; i < bucket.length; i++) {
      for (int k : bucket[i]) {
        input[j++] = k;
      }
    }
  }

  private static void sortBucketElement(List<Integer>[] bucket) {
    for (int i = 0; i < bucket.length; i++) {
      Collections.sort(bucket[i]);
    }
  }

  private static void insertIntoBucket(List<Integer>[] bucket, int[] input) {
    for (int i = 0; i < input.length; i++) {
      bucket[hash(input[i])].add(input[i]);
    }
  }

  private static int hash(int value) {
    return value / 10;
  }
}
