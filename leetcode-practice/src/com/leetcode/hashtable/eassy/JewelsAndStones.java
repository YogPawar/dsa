package com.leetcode.hashtable.eassy;

public class JewelsAndStones {

  public static void main(String[] args) {
    int counter = numJewelsInStones("aA", "aAAbbbb");
    System.out.println(counter);
  }

  private static int numJewelsInStones(String jewels, String stones) {
    int counter = 0;
    for (int i = 0; i < stones.length(); i++) {
      if (jewels.indexOf(stones.charAt(i)) != -1) {
        counter++;
      }
    }
    return counter;
  }

}
