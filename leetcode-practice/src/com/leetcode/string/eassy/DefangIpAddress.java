package com.leetcode.string.eassy;

public class DefangIpAddress {

  public static void main(String[] args) {
    String ip = defangIp("1.1.1.1");
    System.out.println(ip);
    System.out.println(defangLogic("1.1.1.1"));
  }

  private static String defangIp(String s) {
    return s.replace(".", "[.]");
  }

  private static String defangLogic(String address) {
    char delimeter = '.';
    if (address.isBlank() || address.isEmpty()) {
      return "";
    }
    StringBuffer sb = new StringBuffer();
    for (char ch : address.toCharArray()) {
      if (ch == delimeter) {
        sb.append("[.]");
      } else {
        sb.append(ch);
      }
    }
    return sb.toString();
  }

}
