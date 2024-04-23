package com.leetcode.array.eassy;

import javax.swing.JProgressBar;

public class MaxWealth {

  public static void main(String[] args) {
    int[][] accounts = {{1, 2, 3}, {3,2,1}};
    int max = maxWealth(accounts);
    System.out.println("Max Profit is : " + max);
  }

  private static int maxWealth(int[][] accounts) {
    int wealth = 0;
    for (int i = 0; i < accounts.length; i++) {
      int profit = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        profit += accounts[i][j];
      }
      wealth = Math.max(wealth, profit);
    }
    return wealth;
  }

}
