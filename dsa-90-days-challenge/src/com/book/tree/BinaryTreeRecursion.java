package com.book.tree;

public class BinaryTreeRecursion {

  TreeNode root;

  public TreeNode insert(int data) {
    if (root == null) {
      root = new TreeNode(data);
    }
    return insert(root, data);
  }

  private TreeNode insert(TreeNode currentNode, int data) {
    if (currentNode == null) {
      return new TreeNode(data);
    }
    if (data < currentNode.getData()) {
      currentNode.setLeft(insert(currentNode.getLeft(), data));
    } else if (data > currentNode.getData()) {
      currentNode.setRight(insert(currentNode.getRight(), data));
    }
    return currentNode;
  }

  //traverse the tree.

  public void preOrder(TreeNode root) {
    if (root != null) {
      System.out.print(root.getData() + " ");
      preOrder(root.getLeft());
      preOrder(root.getRight());
    }
  }

  public void inOrder(TreeNode root) {
    if (root != null) {
      inOrder(root.getLeft());
      System.out.print(root.getData() + " ");
      inOrder(root.getRight());
    }
  }

  public void postOrder(TreeNode root) {
    if (root != null) {
      postOrder(root.getLeft());
      postOrder(root.getRight());
      System.out.print(root.getData() + " ");
    }
  }


}
