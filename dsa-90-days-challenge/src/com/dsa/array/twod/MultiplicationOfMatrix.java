package com.dsa.array.twod;

import java.util.Arrays;

public class MultiplicationOfMatrix {

  public static void main(String[] args) {
    int[][] inputOne = {{2, 3, 5}, {4, 5, 6}};
    int[][] inputTwo = {{4, 5, 6, 7}, {8, 10, 11, 12}, {13, 14, 15, 16}};
    int[][] resultArray = doMultiplication(inputOne, inputTwo);
    System.out.println("First Array : " + Arrays.deepToString(inputOne));
    System.out.println("Second Array : " + Arrays.deepToString(inputTwo));
    System.out.println(Arrays.deepToString(resultArray));
  }

  private static int[][] doMultiplication(int[][] inputOne, int[][] inputTwo) {
    if (inputOne[0].length != inputTwo.length) {
      System.out.println("Invalid Array Size");
      return null;
    }
    int[][] result = new int[inputOne.length][inputTwo[0].length]; //2 * 4 array
    int multiplication = 0;
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        for (int k = 0; k < inputOne[0].length; k++) {
          result[i][j] = inputOne[i][k] * inputTwo[k][j];

        }
      }
    }
    return result;
  }
}
