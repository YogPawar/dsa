package com.misc.arrays;

public class ShareProfit {

  public static int maxProfit(int[] sharePrices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : sharePrices) {
      minPrice = Integer.min(minPrice, price);
      int profit = price - minPrice;
      maxProfit = Integer.max(profit, maxProfit);

    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int[] sharePrice = {7, 1, 5, 3, 6, 4};
    System.out.println(maxProfit(sharePrice));
  }


}
