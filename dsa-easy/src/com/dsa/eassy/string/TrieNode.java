package com.dsa.eassy.string;

import java.util.Arrays;

public class TrieNode {

  TrieNode[] children;
  boolean isEndOfWord;

  public TrieNode() {
    children = new TrieNode[26];
    isEndOfWord = false;
  }

  public void insert(TrieNode root, String key) {
    TrieNode currentNode = root;
    for (int i = 0; i < key.length(); i++) {
      int index = key.charAt(i) - 'a';
      //check if key is already exist or not
      if (currentNode.children[index] == null) {
        currentNode.children[index] = new TrieNode();
      }
      currentNode = currentNode.children[index];
    }
    currentNode.isEndOfWord = true;
  }

  public boolean search(TrieNode root, String key) {
    TrieNode currentNode = root;
    for (int i = 0; i < key.length(); i++) {
      int index = key.charAt(i) - 'a';
      if (currentNode.children[index] == null) {
        return false;
      }

      currentNode = currentNode.children[index];
    }
    return currentNode.isEndOfWord;
  }

  @Override
  public String toString() {
    return "TrieNode{" +
        "children=" + Arrays.toString(children) +
        ", isEndOfWord=" + isEndOfWord +
        '}';
  }
}
