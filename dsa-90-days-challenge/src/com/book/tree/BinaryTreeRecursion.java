package com.book.tree;

public class BinaryTreeRecursion {

  BinaryTreeNode root;

  public BinaryTreeNode insert(int data) {
    if (root == null) {
      root = new BinaryTreeNode(data);
    }
    return insert(root, data);
  }

  private BinaryTreeNode insert(BinaryTreeNode currentNode, int data) {
    if (currentNode == null) {
      return new BinaryTreeNode(data);
    }
    if (data < currentNode.getData()) {
      currentNode.setLeft(insert(currentNode.getLeft(), data));
    } else if (data > currentNode.getData()) {
      currentNode.setRight(insert(currentNode.getRight(), data));
    }
    return currentNode;
  }

  //traverse the tree.

  public void preOrder(BinaryTreeNode root) {
    if (root != null) {
      System.out.print(root.getData() + " ");
      preOrder(root.getLeft());
      preOrder(root.getRight());
    }
  }

  public void inOrder(BinaryTreeNode root) {
    if (root != null) {
      inOrder(root.getLeft());
      System.out.print(root.getData() + " ");
      inOrder(root.getRight());
    }
  }

  public void postOrder(BinaryTreeNode root) {
    if (root != null) {
      postOrder(root.getLeft());
      postOrder(root.getRight());
      System.out.print(root.getData() + " ");
    }
  }


}
