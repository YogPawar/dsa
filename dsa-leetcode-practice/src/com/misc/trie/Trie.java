package com.misc.trie;

public class Trie {

  static Node root = new Node(); //it will be empty to store the next element

  static class Node {

    Node[] children;
    boolean eow; // end of the word

    public Node() {
      children = new Node[26];
      for (int i = 0; i < 26; i++) { //initializing the array to hold the object
        children[i] = null;
      }
      eow = false;
    }
  }
}