package com.misc.bst;

import org.w3c.dom.Node;

public class BinarySearchTree {

  public Node root;

  public boolean rContains(int i) {
    return rContains(root, i);
  }

  private boolean rContains(Node root, int value) {
    if (root == null) {
      return false;
    }
    if (root.value == value) {
      return true;
    }

    if (root.value > value) {
      return rContains(root.left, value);
    } else {
      return rContains(root.right, value);
    }
  }

  public Node rInsert(int value) {
    if (root == null) {
      root = new Node(value);
    }
    return rInsert(root, value);
  }

  private Node rInsert(Node currentNode, int value) {
    if (currentNode == null) {
      return new Node(value);
    }
    if (value < currentNode.value) {
      currentNode.left = rInsert(currentNode.left, value);
    } else {
      currentNode.right = rInsert(currentNode.right, value);
    }
    return currentNode;
  }

  class Node {

    int value;
    Node left;
    Node right;

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
        if (temp.left == null) {
          temp.left = newNode;
          return true;
        }
        temp = temp.left;
      } else {
        if (temp.right == null) {
          temp.right = newNode;
          return true;
        }
        temp = temp.right;
      }
    }
  }

  public boolean contains(int value) {
    if (root == null) {
      return false;
    }
    Node temp = root;
    while (temp != null) {
      if (value < temp.value) {
        temp = temp.left;
      } else if (value > temp.value) {
        temp = temp.right;
      } else {
        return true;
      }
    }
    return false;
  }

}
