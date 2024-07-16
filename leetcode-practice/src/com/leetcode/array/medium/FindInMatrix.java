package com.leetcode.array.medium;

import java.util.Arrays;

public class FindInMatrix {

  //TC : O(MN)
  private static boolean findInMatrix(int[][] matrix, int target) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == target) {
          return true;
        }
      }

    }
    return false;
  }

  //TC O(log(m * n))

  private static boolean findElement(int[][] matrix, int target) {
    int i = 0;
    int n = matrix.length;
    int m = matrix[0].length;
    int j = m - 1;
    while (i >= 0 && i < n && j >= 0 && j < m) {
      if (matrix[i][j] == target) {
        return true;
      } else if (matrix[i][j] > target) {
        j--;
      } else if (matrix[i][j] < target) {
        i++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 20, 34, 60}};
    System.out.println(Arrays.deepToString(matrix));
    System.out.println(findElement(matrix, 34));
  }

}
