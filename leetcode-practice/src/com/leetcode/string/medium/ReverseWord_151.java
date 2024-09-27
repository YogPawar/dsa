package com.leetcode.string.medium;

public class ReverseWord_151 {

  public String reverseWords(String s) {
    String[] letters = s.trim().split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i = letters.length -1 ; i >= 0; i--){
      if(!letters[i].isEmpty()){
        sb.append(letters[i]).append(" ");
      }

    }
    return sb.toString().trim();
  }

}
