package com.dsa.eassy.string;

public class LongestPrefix {

  public static String longestPrefix(String[] strs) {
    TrieNode root = new TrieNode();
    StringBuilder prefix = new StringBuilder();// "";
    for (String str : strs) {
      root.insert(root, str);
    }
    while (true) {
      int counter = 0;
      int nextIndex = -1;
      for (int i = 0; i < 26; i++) {
        if (root.children[i] != null) {
          counter += 1;
          nextIndex = i;
        }
      }

      if (counter != 1 || root.isEndOfWord) {
        break;
      }
      prefix.append((char) (nextIndex + 'a'));
      root = root.children[nextIndex];
    }

    return prefix.toString();
  }

  public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
    System.out.println(longestPrefix(strs));
  }
}
