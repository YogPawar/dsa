package com.misc.bst.solution;

import java.util.Stack;

public class BinerySearchTree {

  Node root;

  class Node {

    int value;
    Node leftChild;
    Node rightChild;

    Node(int value) {
      this.value = value;
    }
  }

  public boolean insert(int value) {
    Node newNode = new Node(value);
    if (root == null) {
      root = newNode;
      return true;
    }
    Node temp = root;
    while (true) {
      if (newNode.value == temp.value) {
        return false;
      }
      if (newNode.value < temp.value) {
        if (temp.leftChild == null) {
          temp.leftChild = newNode;
          return true;
        }
        temp = temp.leftChild;
      } else {
        if (temp.rightChild == null) {
          temp.rightChild = newNode;
          return true;
        }
        temp = temp.rightChild;
      }
    }
  }

  public Integer findKthSmallest(int k) {
    Stack<Node> stack = new Stack<>();
    Node node = this.root;
    while (!stack.isEmpty() || node != null) {
      while (node != null) {
        stack.push(node);
        node = node.leftChild;
      }

      node = stack.pop();
      k -= 1;
      if (k == 0) {
        return node.value;
      }
      node = node.rightChild;
    }
    return null;
  }

  public static void main(String[] args) {
    BinerySearchTree binerySearchTree = new BinerySearchTree();
    binerySearchTree.insert(67);
    binerySearchTree.insert(5);
    binerySearchTree.insert(25);
    binerySearchTree.insert(51);
    binerySearchTree.insert(15);
    binerySearchTree.insert(7);

    System.out.println(binerySearchTree.findKthSmallest(3));
  }

}
