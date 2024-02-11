package dsa.com.search;

import java.util.Arrays;

public class LinearSearch {

  public static void main(String[] args) {
    int[] input = {1, 3, -45, 66, 10};

    System.out.println("Array : " + Arrays.toString(input));
    int index = linearSearch(input, 66);
    System.out.println("Index for 66 : " + index);
    int index2 = linearSearch(input, -45);
    System.out.println("Index for -45 :  " + index2);
    int index3 = linearSearch(input, 10);
    System.out.println("Index for 10 : " + index3);

    int indx4 = linearSearch(input, 100);
    System.out.println("Index for 100 : " + indx4);
  }

  private static int linearSearch(int[] input, int value) {
    for (int i = 0; i < input.length; i++) {
      if (value == input[i]) {
        return i;
      }
    }
    return -1;
  }

}
