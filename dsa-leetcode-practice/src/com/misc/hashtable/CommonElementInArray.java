package com.misc.hashtable;

import java.util.HashMap;

public class CommonElementInArray {

  public boolean itemInCommon(int[] array1, int[] array2) {
    HashMap<Integer, Boolean> hashMap = new HashMap<>();
    for (int i : array1) {
      hashMap.put(i, true);
    }
    for (int j : array2) {
      if (hashMap.get(j) != null) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    CommonElementInArray commonElementInArray = new CommonElementInArray();
    int[] array1 = {1, 3, 5};

    int[] array2 = {2, 4, 5};
    System.out.println(commonElementInArray.itemInCommon(array1, array2));
  }

}
