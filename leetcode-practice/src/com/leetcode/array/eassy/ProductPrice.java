package com.leetcode.array.eassy;

import java.util.Arrays;

public class ProductPrice {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(finalPrice(new int[]{8, 4, 6, 2, 3})));
  }

  private static int[] finalPrice(int[] prices) {
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] <= prices[i]) {
          prices[i] = prices[i] - prices[j];
          break;
        }
      }
    }
    return prices;
  }

}
