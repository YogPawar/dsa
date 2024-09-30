package com.dsa.eassy.array;

public class BuySellStock {

  private static int maxProfit(int[] sharePrices) {
    int minPrice = sharePrices[0]; // setting the day one price as minPrice
    int maxProfit = 0;
    for (int i = 1; i < sharePrices.length; i++) {
      int currentProfit = sharePrices[i] - minPrice;
      maxProfit = Math.max(maxProfit, currentProfit);
      minPrice = Math.min(minPrice, sharePrices[i]);
    }
    return maxProfit;
  } //TC : O(N) SC : O(1)

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
  }
}
