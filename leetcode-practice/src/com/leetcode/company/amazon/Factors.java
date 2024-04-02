package com.leetcode.company.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.prefs.PreferenceChangeListener;

public class Factors {

  public static void main(String[] args) {
    System.out.println(kthFactor(7, 2));
  }

  public static int kthFactor(int n, int k) {
    List<Integer> factors = new ArrayList<>();
    for (int j = 1; j <= n; j++) {
      if (n % j == 0) {
        factors.add(j);
      }
    }
    return factors.size() < k ? -1 : factors.get(k - 1);
  }

  /**
   * TC : O(n)
   *
   * @param n
   * @param k
   * @return
   */
  public static int kthFactorOptimal(int n, int k) {
    int count = 0;
    for (int i = 0; i <= n; i++) {
      if (i % n == 0) {
        count++;
      }
      if (count == k) {
        return i;
      }
    }
    return -1;
  }

}
