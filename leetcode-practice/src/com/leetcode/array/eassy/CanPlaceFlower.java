package com.leetcode.array.eassy;

import java.sql.SQLOutput;

public class CanPlaceFlower {

  public static void main(String[] args) {
    CanPlaceFlower canPlaceFlower = new CanPlaceFlower();
    int[] plot = {1, 0, 0, 0, 1};
    System.out.println(" plots :  [1,0,0,0,1] flower = 1 ");
    System.out.println("Expected output : true");
    System.out.println("Actual Output : " + canPlaceFlower.canPlaceFlowers(plot, 1));

    System.out.println(" plots :  [1,0,0,0,1] flower = 2 ");
    System.out.println("Expected output : false");
    System.out.println("Actual Output : " + canPlaceFlower.canPlaceFlowers(plot, 2));
  }

  public boolean canPlaceFlowers(int[] flowers, int n) {
    int count = 0;

    for (int i = 0; i < flowers.length; i++) {
      if (flowers[i] == 0) {
        int prev = i == 0 ? 0 : i - 1;
        int next = i == flowers.length - 1 ? 0 : i + 1;
        if (prev == 0 || next == 0) {
          flowers[i] = 1;
          count += 1;
        }
      }
    }
    return count >= n;
  }
}
