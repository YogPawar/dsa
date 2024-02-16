package dsa.com.sorting.radix;

import java.util.Arrays;

public class RadixSort {

  public static void main(String[] args) {
    int[] inArray = {4725, 4586, 1330, 8792, 1594, 5729};

    radixSort(inArray, 10, 4);

    System.out.println(Arrays.toString(stringArray));
  }

  private static void radixSort(int[] inArray, int radix, int width) {

    for (int j = 0; j < width; j++) {
      radixSingleSort(inArray, j, radix);

    }
  }

  private static void radixSingleSort(int[] inArray, int position, int radix) {
    int numItems = inArray.length;
    int countArray[] = new int[radix];
    for (int value : inArray) {
      countArray[getDigit(position, value, radix)]++;
    }

    //Adjust the count array
    for (int j = 1; j < radix; j++) {
      countArray[j] += countArray[j - 1];
    }

    int[] temp = new int[numItems];
    for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
      temp[--countArray[getDigit(position, inArray[tempIndex], radix)]] = inArray[tempIndex];
    }

    for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
      inArray[tempIndex] = temp[tempIndex];
    }

  }

  public static int getDigit(int position, int value, int radix) {
    return value / (int) Math.pow(10, position) % radix;
  }


}
