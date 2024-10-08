package com.dsa.eassy.string;

import java.sql.SQLOutput;
import org.w3c.dom.ls.LSOutput;

public class RunTrie {

  public static void main(String[] args) {
    TrieNode root = new TrieNode();
    String[] words = {"apple", "app", "apply", "ant", "tat"};
    for (String s : words) {
      root.insert(root, s);
    }

    System.out.println(root.search(root, "app"));
  }
}
