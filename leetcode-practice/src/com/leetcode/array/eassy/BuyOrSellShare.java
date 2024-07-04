package com.leetcode.array.eassy;

public class BuyOrSellShare {

  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};
    System.out.println(maxProfit(prices));
  }

  private static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int left = 0;
    for (int right = 1; right < prices.length; right++) {
      if (prices[left] < prices[right]) {
        int currentProf = prices[right] - prices[left];
        maxProfit = Math.max(maxProfit, currentProf);
      } else {
        left = right;
      }
    }
return maxProfit;
  }

}
