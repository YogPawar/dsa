package com.dsa.eassy.binary;

public class BinaryTree {

  Node root;


  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.insert(5);
    tree.insert(10);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);
    tree.insert(10);

    tree.inOrder(tree.root);


  }

  public Node insert(int data) {
    if (root == null) {
      root = new Node(data);
    }
    return insert(root, data);
  }

  private Node insert(Node currentNode, int data) {
    if (currentNode == null) {
      return new Node(data);
    }
    if (data < currentNode.data) {
      currentNode.left = insert(currentNode.left, data);
    } else if (data > currentNode.data) {
      currentNode.right = insert(currentNode.right, data);
    }
    return currentNode;
  }

  public void inOrder(Node root) {
    if (root != null) {
      System.out.println(root.data);
      inOrder(root.left);
      inOrder(root.right);
    }

  }

  class Node {

    public int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
    }
  }
}
