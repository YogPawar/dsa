package com.dsa.array.twod;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoDArray {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the no of Rows : ");
    int n = scan.nextInt();
    System.out.println("Enter the number of columns : ");
    int m = scan.nextInt();

    int[][] array = new int[n][m];
    System.out.println("Enter the element into array :");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        array[i][j] = scan.nextInt();
      }
    }

    //print the array
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

}
