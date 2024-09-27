package com.leetcode.string.eassy;

import javax.imageio.plugins.tiff.TIFFField;

public class IsSubString {

  public static void main(String[] args) {
    System.out.println(isSubString("abc", "treaetrbdfes"));
  }

  private static boolean isSubString(String first, String second) {
    int f = 0;
    int s = 0;
    while (f < first.length() && s < second.length()) {
      if (first.charAt(f) == second.charAt(s)) {
        f++;
      }
      s++;
    }
    return f == first.length();
  }

}
