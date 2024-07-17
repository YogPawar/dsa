package com.leetcode.array.medium;

import java.util.Arrays;

public class SetMatrixToZero {

  private static void setZeros(int[][] matrix) {
    int columns = matrix.length;
    int rows = matrix[0].length;
    boolean[][] isZero = new boolean[columns][rows];
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        isZero[i][j] = matrix[i][j] == 0;
      }
    }

    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        if (isZero[i][j]) {
          //Set the entire rows to zero
          for (int c = 0; c < columns; c++) {
            matrix[i][c] = 0;
          }
          for (int r = 0; r < rows; r++) {
            matrix[r][j] = 0;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
   /* int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    setZeros(matrix);
    System.out.println(Arrays.deepToString(matrix));*/

    int[][] case2 = {{0, 1}};
    setZeros(case2);
    System.out.println(Arrays.deepToString(case2));

  }

}
